class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length== 0){
            return 0;
        }
        int mx=1;
        int con=1;
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    con++;}
                
                else{
                    mx = Math.max(mx,con);
                    con =1;
                }
                
            }
        }
        return Math.max(mx, con);
        
    }
}