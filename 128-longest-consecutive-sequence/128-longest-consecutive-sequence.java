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

/**class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
**/