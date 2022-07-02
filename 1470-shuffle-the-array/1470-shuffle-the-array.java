class Solution {
    public int[] shuffle(int[] nums, int n) {
        int sz = nums.length;
        int[] ne = new int[sz];
        int x = 0;
        for(int i=0; i<n; i++){
            ne[x] = nums[i];
            x= x+2;
        }
        int y = sz-1;
        for(int j= sz-1; j>=n; j--){
            ne[y] = nums[j];
            y = y-2;
        }
        return ne;
    }
}