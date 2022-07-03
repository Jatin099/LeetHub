class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int[] arr=nums.clone();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            Integer key =new Integer(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,count);
            }
            count++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=map.get(nums[i]);
        }   
        return nums;   
    }
}