class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size =0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0)
                size += nums[i];
        }
        
        int k=0;
        int ans[] = new int[size];
        for(int i=0;i<nums.length-1;i++){
            int count=0;
            if(i%2==0){
                count=nums[i];
            }
            while(count>0){
                ans[k]=nums[i+1];
                count--;
                k++;
            }
        }
        return ans;
    }
}