class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> jewel = new HashMap<Character, Integer>();
        for(int i=0; i<jewels.length();i++)
            jewel.put(jewels.charAt(i),jewel.getOrDefault(jewels.charAt(i),0)+1);
        
        int ans = 0;
        for(int i = 0; i < stones.length() ;i++) 
            if(jewel.containsKey(stones.charAt(i))) 
                ans++;
        
        return ans;
    }
}