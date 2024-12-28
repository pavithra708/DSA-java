import java.io.*;
import java.util.*;

public class Solution {
    public static void kahnAlgorithm(List<List<Integer>> adj,int indegree[],int n){
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }
        while(que.size()>0){
            int node=que.poll();
            System.out.print(node+" ");
            for(int nbr:adj.get(node)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    que.add(nbr);
                }
            }
        }
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            indegree[v]++; //incoming edges finding array
            //if u want outcoming edges then do,indegree[u]++;
        }
        kahnAlgorithm(adj,indegree,n);
    }
}
