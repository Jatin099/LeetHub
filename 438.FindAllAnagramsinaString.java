class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sl = s.length();
        int pl = p.length();
        
        
        List<Integer> lst = new ArrayList<Integer>();
        
        if(pl> sl) return lst;
        int[] count = freq(p);
        
        int[]currentCount = freq(s.substring(0,pl));
        
        if(areSame(count, currentCount))
            lst.add(0);
        
        int i;
        for(i=pl; i<sl;i++){
            currentCount[s.charAt(i-pl) - 'a']--;
            currentCount[s.charAt(i) - 'a']++;
            if(areSame(count,currentCount)){
                lst.add(i-pl+1);
            }   
        }  
        return lst;
    }
    
    private boolean areSame(int[] x ,int[] y){
        for(int i=0; i<26; i++){
            if(x[i] != y[i])
                return false;
        }
        return true;
    }
    
    private int[] freq(String s){
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        return count;
    }
}
