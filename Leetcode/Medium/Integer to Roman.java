import java.util.*;
public class string {
    public static String romanToInt(int s) {
       int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(s>=value[i]){
                res.append(arr[i]);
                s-=value[i];
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
       int str=26;
       System.out.println(romanToInt(str));
    }
