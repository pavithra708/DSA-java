public class string {
    public static int stringtoInt(String s) {
        s=s.trim();
        if(s.length()==0 || s==null){
            return 0;
        }

        int sign=1,start=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            start++;
        }
        else if(s.charAt(0)=='+'){
            start++;
        }

        int res=0;
        for(int i=start;i<s.length();i++){
            char c=s.charAt(i);
            if(c<'0' || c>'9'){
                break;
            }
            int digit=c-'0';
            if(res>(Integer.MAX_VALUE-digit)/10){
                return sign==1 ? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res=res*10+digit;
        }
        return sign*res;
    }

    public static void main(String[] args) {
       String str=" -1734bcs87";
       System.out.println(stringtoInt(str));
    }
}
