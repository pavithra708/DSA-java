import java.io.*;
import java.util.*;

public class Solution {
    public static int maxSubarray(int n,int arr[]){
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubarray(n,arr));
    }
}
