class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++ ){
            int req = (int)(target-nums[i]);
            if(indexMap.containsKey(req)){
                int toReturn[] = {indexMap.get(req),i};
                return toReturn;
            }
            indexMap.put(nums[i],i);
        }
        return null;
    }
    
}
