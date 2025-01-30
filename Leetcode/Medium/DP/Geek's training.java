//same as ninja training
class Solution {
  //memoization 
    public int geek(int arr[][],int n,int dp[][],int last){
        if(dp[n][last]!=-1){
            return dp[n][last];
        }
        int maxi=0;
        if(n==0){
            for(int i=0;i<=2;i++){
                if(i!=last){
                   maxi=Math.max(maxi,arr[0][i]); 
                }
            }
            return dp[n][last]=maxi;
        }
        maxi=0;
        for(int i=0;i<=2;i++){
            if(i!=last){
                int activity=arr[n][i]+geek(arr,n-1,dp,i);
            maxi=Math.max(maxi,activity);
           }
        }
        return dp[n][last]=maxi;
    }
    
    public int maximumPoints(int arr[][]) {
        // code here
        int n=arr.length;
        int dp[][]=new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return geek(arr,n-1,dp,3);
    }
}
