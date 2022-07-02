class Solution {
    public String defangIPaddr(String address) {

    int n = address.length();
    String ne = "";
    char bef = '[';
    char aft = ']';
    for(int i=0; i<n; i++){
        if(address.charAt(i) == '.'){
            char dot = '.';
            ne = ne + bef + dot + aft;
        }
        else{
            char mem = address.charAt(i);
            ne = ne + mem;
        }
    }
        return ne;
    }
}

/*
    class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();   
        for(int i = 0 ; i < address.length() ; i++){
            char current = address.charAt(i);
            if(current == '.'){
                result.append("[.]");
            }
            else{
                result.append(current);
            }
        }
        return result.toString();
    }
}
*/