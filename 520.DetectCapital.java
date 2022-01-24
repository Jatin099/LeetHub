// My solution
class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res= true;
        int len = word.length();
        int countU = 0;
        int countL =0;
        if(Character.isUpperCase(word.charAt(0))){
            for(int i=1; i<len; i++){
                if(Character.isUpperCase(word.charAt(i))){
                    countU++;    
                }
                else{
                    countL++;
                }
            }
            if(countU == len-1 || countL == 0 || countL == len-1){
                res = true;
            }
            else{
                res = false;
            }
        }
        else{
            for(int i=1; i<len; i++){
                if(Character.isUpperCase(word.charAt(i))){
                    res = false;
                    break;
                }
                else{
                    countL++;
                }
            }
            if(countL == len-1){
                res = true;
            }
        }
        return res;
        
    }
}

// Easy Method
class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 1) {
            return true;
        }

        // case 1: All capital
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < n; i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        // case 2 and case 3
        } else {
            for (int i = 1; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        // if pass one of the cases
        return true;
    }
}
