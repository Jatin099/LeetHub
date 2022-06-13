class Solution{
    public String longestPalindrome(String s){
        if(s == null || s.length()<1) return "";
        int start =0, end =0;
        for(int i =0; i<s.length(); i++){
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1,len2);
            if(len > end-start){
                start = i-(len-1) /2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
    
    private int expandAroundCenter(String s, int left, int right){
        int L = left, R = right;
        while(L>=0 && R<s.length() && s.charAt(L) == s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}


// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         String ans="";
//             for(int i =0; i<n; i++){
//                 for(int j=i+1; j<=n; j++){
//                     String nw = lps(s.substring(i,j));
//                     if(nw.length()>ans.length()){
//                         ans = nw;
//                     }
//                 }
//             }
//         return ans;
//     }
    
//     public String lps(String s){
//         StringBuffer stf;
//         String res = "";
        
//             stf = new StringBuffer(s);
//             stf.reverse();
            
//             if(stf.toString().compareTo(s)== 0){
//                 res = s;
//             }
        
//         return res;
//     }

// }