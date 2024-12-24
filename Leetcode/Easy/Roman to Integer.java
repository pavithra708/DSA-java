class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
       int preValue=0;
       int total=0;
       for(int i=s.length()-1;i>=0;i--){
         int currValue=map.get(s.charAt(i));
         if(preValue>currValue){
             total-=currValue;
         }
         else{
               total+=currValue;
         }
         preValue=currValue;
       }
          return total;
    }
}