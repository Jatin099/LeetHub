class Solution {
    
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst = new ArrayList<>();
        int max = candies[0];
        for(int val:candies){
if(max < val) max=val;
}
        for(int val : candies){
            
            if(val+extraCandies >= max){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        
        }
        return lst;
    }
}