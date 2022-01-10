// Using XOR Method
/* class Solution {
    public String addBinary(String a, String b) {
         int i = a.length() - 1, j = b.length() - 1, c = 0;
	StringBuilder sb = new StringBuilder();

	while (i >= 0 || j >= 0 || c == 1) {
		int aVal = (i < 0) ? 0 : a.charAt(i--) - '0';
		int bVal = (j < 0) ? 0 : b.charAt(j--) - '0';

		sb.insert(0,  (char) ('0' + aVal ^ bVal ^ c));
		c = (aVal + bVal + c) >> 1;
	}

	return sb.toString();
}
}*/

// Using Normal Method
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
