class Solution {
    
    public int subSet(int[] nums,int start, int end, int ans){
        
        if(start == end)
            return ans;
        return subSet(nums, start+1, end, ans^nums[start])+ subSet(nums, start+1, end, ans);
    }
    
    public int subsetXORSum(int[] nums) {
        return subSet(nums, 0, nums.length, 0);
    }
}