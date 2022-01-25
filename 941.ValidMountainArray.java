class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int l =0;
        int r = arr.length-1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l+1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r-1]) r--;
        
        return l == r;
    
    }
    
}

// 2nd method
class Solution {
    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
