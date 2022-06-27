class Solution {
    public int minPartitions(String n) {
        int len = n.length();
        int max = 0;
        for(int i=0; i<len; ++i){
            int ne = n.charAt(i) - '0';
            if(ne>max){
                max = ne;
            }
            if(max==9){
                break;
            }
        }
        return max;
    }
}