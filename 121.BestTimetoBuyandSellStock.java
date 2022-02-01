class Solution {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int overallProfit = 0;
        int ProfitSoldToday = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]<lsf){
                lsf = prices[i];
            }
            ProfitSoldToday = prices[i] - lsf;
            if(overallProfit<ProfitSoldToday){
                overallProfit = ProfitSoldToday;
            }
        }
        
        
        return overallProfit;
}
}
