class Solution {
    public int balancedStringSplit(String s) {
        int cr=0; 
        int cl = 0;
        int ans = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == 'R')
                cr++;
            else
                cl++;
            if(cr == cl)
                ans++;
        }
        return ans;
    }
}