class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1 , right = 1;
        for(int pile: piles){
            right = Math.max(right, pile);
        }
        
        while(left<right){
            int mid = (left+right)/2;
            int hrspnt = 0;
            
            for(int pile: piles){
                hrspnt += Math.ceil((double) pile / mid);
            }
            
            if(hrspnt<= h){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        
        return right;
    }
}
