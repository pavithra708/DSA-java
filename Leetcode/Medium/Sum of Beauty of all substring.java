class Solution {
    public int minCount(int freq[]){
        int min=Integer.MAX_VALUE;
        for(int num:freq){
            if(num!=0){
            min=Math.min(min,num);
            }
        }
        return min;
    }
    public int maxCount(int freq[]){
        int max=Integer.MIN_VALUE;
        for(int num:freq){
            max=Math.max(max,num);
        }
        return max;
    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++){
                 freq[s.charAt(j)-'a']++;
             int beauty=maxCount(freq)-minCount(freq);
                 sum+=beauty;
            }
        }
        return sum;
    }
}
