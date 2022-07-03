class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int count =0;
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
// }
//         }
//         return count;
//     }
    
    
    
    
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val= map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }
        }
        
        for (Map.Entry<Integer, Integer> set : map.entrySet()){
            int val=set.getValue();
           count+= (val * (val-1))/2;
        }
        
        return count;
    }
}