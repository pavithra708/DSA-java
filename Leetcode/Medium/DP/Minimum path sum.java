class Solution {
     public int path(int grid[][],int m,int n,int dp[][]){
       //Tabulation
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[0][0]=grid[0][0];
                
                }
                 else{
                  int up=grid[i][j],left=grid[i][j];

                  if(i>0){
                  up+=dp[i-1][j];
                  }
                  else{
                  up+=(int)Math.pow(10,9);
                  }

                   if(j>0) {
                   left+=dp[i][j-1];
                   }
                 else {
                    left+=(int)Math.pow(10,9);
                 }

                 dp[i][j]=Math.min(up,left);
            }
            }
        }
        return dp[m-1][n-1];
     }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        return path(grid,m,n,dp);
    }
}
