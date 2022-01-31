class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rvs(nums, 0, nums.length-1);
        rvs(nums, 0, k-1);
        rvs(nums, k, nums.length-1);
        
    }
    public void rvs(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
