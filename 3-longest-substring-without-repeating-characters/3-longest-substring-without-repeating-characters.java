class Solution {
    public int lengthOfLongestSubstring(String s) {
         int[] chars = new int[128];
 
        int left = 0;
        int right = 0;
 
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
 
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
 
            res = Math.max(res, right - left + 1);
 
            right++;
        }
        return res;
    }
}
//         LinkedList <Integer> cnt = new LinkedList<Integer>();
//         int k =0;
//         for (int i = 0; i < s.length(); i++) {
//         String subStr="";
//         for (int j = i; j < s.length(); j++) {
//             subStr += s.charAt(j);
//                 String nw = subStr;
//                 if(!occur(nw)){
//                     if(nw.length() >= 95){
//                         cnt.add(k,95);
//                         break;
//                     }
//                     else{
//                     cnt.add(k,nw.length());
//                     k++;
//                     }
//                 }
//             }
//         }
//         int ans=0;
//         if(s.equals("")){
//             ans=0;
//         }
//         else if(s.equals(" ")){
//             ans = 1;
//         }
//         else if(s.length()==1){
//             ans =1;
//         }
//         else{
//             ans = Collections.max(cnt);
//         }
                
//         return ans;
//     }
    
//     public boolean occur(String s){
        
//         HashMap<Character, Integer> charcnt = new HashMap<Character, Integer>();
//         char[] str = s.toCharArray();
//         boolean ans = false;
//         for(char c:str){
//             if(charcnt.containsKey(c)){
//                 charcnt.put(c,charcnt.get(c)+1);
//                 ans = true;
//                 break;
//             }
//             else{
//                 charcnt.put(c,1);
//             }
            
//         }
        
        
        // for( Map.Entry entry: charcnt.entrySet()){
        //     int mp = (Integer)entry.getValue();
        //     if(mp>1){
        //         ans = true;
        //         }
        // }
        // return ans;
    // }
