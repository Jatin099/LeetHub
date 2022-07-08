class Solution {
    public String freqAlphabets(String s) {
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(i<=s.length()-3 && s.charAt(i+2)=='#'){
                String str = s.substring(i,i+2);
                int number = Integer.parseInt(str);
                
                ans += arr[number - 1];
                i = i+2;
            }
            else{
                String spr = s.substring(i,i+1);
                int n = Integer.parseInt(spr);
                ans += arr[n-1];
            }
        }
        return ans;
    }
}