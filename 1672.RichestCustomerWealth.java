class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int res=0;
        for(int[] val: accounts){
            int max =0;
            for(int ele : val){
                max += ele;
            }
            if(res<max){
                res = max;
            }
        }
        
        return res;
    }
    
}
