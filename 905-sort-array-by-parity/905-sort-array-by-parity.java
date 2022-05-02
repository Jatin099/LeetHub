class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int t =0;
        
        for(int i=0; i<nums.length; ++i){
            if(nums[i]%2 == 0)
                arr[t++] = nums[i];
        }
        for(int j =0; j<nums.length; ++j){
            if(nums[j]%2 == 1)
                arr[t++] = nums[j];
        }
        return arr;
    }
}