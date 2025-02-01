import java.io.*;
import java.util.*;

public class Solution {
    public static int Repeat(String s){
       int maxi=0,i=0;
        Set<Character> set=new HashSet<>();
        for(int j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            maxi=Math.max(maxi,j-i+1);
        }
        return maxi;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(Repeat(str));
    }
}
