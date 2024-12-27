import java.io.*;
import java.util.*;

public class Solution {
    public static void bfs(List<Integer> adj[],int n,int m){
        Queue<Integer> que=new LinkedList<>();
        int visited[]=new int[n];
        que.add(0);
        visited[0]=1;
        
        while(que.size()>0){
            int node=que.poll();
            
            System.out.print(node+" ");
            
            for(int j=0;j<adj[node].size();j++){
                if(visited[adj[node].get(j)]==0){
                    que.add(adj[node].get(j));
                    visited[adj[node].get(j)]=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> adj[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
           int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        bfs(adj,n,m);
}
}
