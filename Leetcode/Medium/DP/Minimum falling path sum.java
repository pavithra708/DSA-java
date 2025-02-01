class Solution {
    public int path(int matrix[][]) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m][n];
         for(int i=0;i<m;i++){
            dp[0][i]=matrix[0][i];
         }

         for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=dp[i-1][j]+matrix[i][j];
                int left=matrix[i][j];
                if(j-1>=0){
                    left+=dp[i-1][j-1];
                }
                else{
                    left+=(int)Math.pow(10,9);
                }

                int right=matrix[i][j];
                if(j+1<m){
                    right+=dp[i-1][j+1];
                }
                else{
                    right+=(int)Math.pow(10,9);
                }
                dp[i][j]=Math.min(up,Math.min(left,right));
            }
         }

         int mini=Integer.MAX_VALUE;
         for(int i=0;i<m;i++){
             mini=Math.min(mini,dp[n-1][i]);
         }
         return mini;
    }

    public int minFallingPathSum(int[][] matrix) {
        
        return path(matrix);
    }
}
