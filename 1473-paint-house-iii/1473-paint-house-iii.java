class Solution {
    private int[][][] dp;
    
    private int MAX = 1000000000;
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // house ID // Remaining Target // Last Color
        dp = new int[m+1][target+1][n+1];
        
        int ans = dfs(houses, cost, 0, target, 0, n);
        
        return ans == MAX ? -1 : ans;
    }
    
    private int dfs(int[] houses, int[][] cost, int i, int target, int lastColor, int n){
        // Not possible Case
        if(target<0){
            return MAX;
        }
        
        if(i>= houses.length){
            return target == 0 ? target : MAX;
        }
        
        //already computed
        if (dp[i][target][lastColor]>0) return dp[i][target][lastColor];
        
        // Check if current house is pointed
        if(houses[i] != 0){
            if(lastColor != houses[i]){
                target = target - 1;
            }
            return dfs(houses, cost, i+1, target, houses[i], n);
        }
        
        int ans = MAX;
        // check for each and every color and find the least cost
        for(int color = 1; color <= n; color++){
            ans = Math.min(ans, cost[i][color-1]+dfs(houses, cost, i+1, target-((lastColor != color)?1:0), color, n));
        }
        dp[i][target][lastColor] = ans;
        return ans;
    }
}