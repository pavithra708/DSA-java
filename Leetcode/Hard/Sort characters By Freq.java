class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        StringBuilder res=new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character,Integer> entry = pq.poll();
            char c=entry.getKey();   
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}
