import java.io.*;
import java.util.*;

public class Solution {
    public static boolean bipartite(List<List<Integer>> adj,int n){
        //using colors for marking instead of visited array
        //initaizing with -1 
        int color[]=new int[n];
        Arrays.fill(color,-1);
        Queue<Integer> que=new LinkedList<>();
        que.add(0);
        color[0]=1;
        while(que.size()>0){
            int node=que.poll();
            for(int nbr:adj.get(node)){
                if(color[nbr]==-1){
                que.add(nbr);
                color[nbr]=1-color[node];
            }
                //if color of node and nbr are same then its not bipartite
                else if(color[nbr]==color[node]){
                    return false;    
            }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        //converting array into list
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
    }
         System.out.println(bipartite(adj,n));
    }
}
