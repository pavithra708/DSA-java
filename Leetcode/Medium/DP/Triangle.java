class Solution {
    public int path(List<List<Integer>> triangle,int m,int n,int dp[][]){
      //memoization
        if(m==triangle.size()-1){
            return triangle.get(m).get(n);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int down=triangle.get(m).get(n)+path(triangle,m+1,n,dp);
        int right=triangle.get(m).get(n)+path(triangle,m+1,n+1,dp);
        return dp[m][n]=Math.min(down,right);
    }
  {
  public int path(List<List<Integer>> triangle,int n){
    //tabulation
          int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=triangle.get(n-1).get(i);
        }
         for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){

            int down=triangle.get(i).get(j)+dp[i+1][j];
            int right=triangle.get(i).get(j)+dp[i+1][j+1];

           dp[i][j]=Math.min(down,right);
            }
        }
        return dp[0][0];
    }
  }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int dp[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        return path(triangle,0,0,dp);
    }
}
