import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int adj[][]=new int[n][n];
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for(int i=0;i<n;i++){
            System.out.print(i+" ");
            for(int j=0;j<n;j++){
                if(adj[i][j]==1){
                 System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
