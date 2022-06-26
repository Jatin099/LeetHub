class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int max = 0;
        
        for(int i =0; i<k; i++){
            max += cardPoints[i];
        }
        
        int curr = max;
        for(int i = k-1; i>=0; i--){
            curr -= cardPoints[i];
            curr += cardPoints[cardPoints.length - k+i];
            
            
            max = Math.max(curr, max);
        }
        
        
        return max;
    }
}