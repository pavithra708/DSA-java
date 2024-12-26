class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int nums:stones){
            pq.add(nums);
        }
        while(pq.size()>1){
           int max1=pq.poll();
           int max2=pq.poll();
           if(max1>max2){
               pq.add(max1-max2);
           }
           if(max2>max1){
            pq.add(max2-max1);
           }
        }
        return pq.poll();
    }
}
