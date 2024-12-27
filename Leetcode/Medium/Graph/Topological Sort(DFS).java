import java.io.*;
import java.util.*;

public class Solution {
    public static void dfs_helper(int node,List<List<Integer>> adj,int visited[],Stack<Integer> st){
        visited[node]=1;
        for(int nbr:adj.get(node)){
            if(visited[nbr]==0){
            dfs_helper(nbr,adj,visited,st);
            }
        }
        st.push(node);
    }
    public static void topologicalSort(List<List<Integer>> adj,int n){
        int visited[]=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<n;i++){
            if(visited[i]==0){
                dfs_helper(i,adj,visited,st);
            }
        }
       while(!st.isEmpty()){
           System.out.print(st.pop()+" ");
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
        }
        topologicalSort(adj,n);
    }
}
