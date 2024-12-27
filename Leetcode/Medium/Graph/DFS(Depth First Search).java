import java.io.*;
import java.util.*;

public class Solution {
    public static void dfs_helper(int node,List<List<Integer>> adj,int visited[]){
        visited[node]=1;
        
        System.out.print(node+" ");
        
        for(int nbr:adj.get(node)){
            if(visited[nbr]==0){
                dfs_helper(nbr,adj,visited);
            }
        }
    }
    
    public static void dfs(List<List<Integer>> adj,int n){
        int visited[]=new int[n];
        for(int i=1;i<n;i++){
            if(visited[i]==0){
                dfs_helper(0,adj,visited);
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
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt(); 
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        dfs(adj,n);
    }
}
