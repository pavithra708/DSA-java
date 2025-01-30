class Solution {
    int solve(int height[],int n,int dp[]){
        int prev=0;
        int prev2=0;
        for(int i=1;i<dp.length;i++){
            int cost2=Integer.MAX_VALUE;
            int cost1=prev+Math.abs(height[i]-height[i-1]);
            if(i>1){
                cost2=prev2+Math.abs(height[i]-height[i-2]);
            }
            int curr=Math.min(cost1,cost2);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    int minCost(int[] height) {
        // code here
        int n=height.length-1;
        int dp[]=new int[height.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return solve(height,n,dp);
    }
}
