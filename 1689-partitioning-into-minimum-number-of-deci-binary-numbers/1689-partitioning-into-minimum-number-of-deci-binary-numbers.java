class Solution {
    public int minPartitions(String n) {
        int len = n.length();
        int max = 0;
        for(int i=0; i<len; ++i){
            max = Math.max(n.charAt(i) - '0',max);
           
            if(max==9){
                break;
            }
        }
        return max;
    }
}