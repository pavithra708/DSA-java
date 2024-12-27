import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair{
        int node;
        int parent;
        public Pair(int node,int parent){
            this.node=node;
            this.parent=parent;
        }
    }
     public static boolean bfs(List<List<Integer>> arr,int node,int visited[]){
         Queue<Pair> queue=new LinkedList<>();
         visited[0]=1;
         queue.add(new Pair(node,-1));
         while(queue.size()>0){
            Pair p=queue.remove();
             
             for(int num:arr.get(p.node)){
                 if(visited[num]==0){
                     queue.add(new Pair(num,p.node));
                     visited[num]=1;
                 }
                 else{
                     if(p.parent!=num){
                         return true;
                     }
                 }
             }
         }
         return false;
     }
      public static boolean isCycle(List<List<Integer>> arr,int n){
               int visited[]=new int[n];
                for(int i=1;i<n;i++){
                    if(visited[i]==0){
                        if(bfs(arr,0,visited)){
                            return true;
                        }
                    }
                }
          return false;
      }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        
        System.out.println(isCycle(arr,n));
    }
}
