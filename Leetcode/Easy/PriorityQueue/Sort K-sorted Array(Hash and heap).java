import java.io.*;
import java.util.*;

public class Solution {
    public static void kSorted(int arr[],int n,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int idx=0;
        //int ans[]=new int[n];
        for(int i=0;i<=k && i<n;i++){
            pq.add(arr[i]);
        }
        
        for(int i=k+1;i<n;i++){
            arr[idx++]=pq.poll();
            pq.add(arr[i]);
        }
        while(!pq.isEmpty()){
            arr[idx++]=pq.poll();
        }
        for(int num:arr){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        kSorted(arr,n,k);
    }
}
