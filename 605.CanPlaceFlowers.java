class Solution {
   
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { // can place?
                -- n;
                if (n == 0) return true;
                flowerbed[i] = 1; // place!
            }
        }
        return false;
    }
}

// Method 2:
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeros = 1, ans = 0; // Easier handling of prefixes, just initialize zeros to 1
        for (int i = 0; i < flowerbed.length; i ++) {
            if (flowerbed[i] == 0) {
                ++ zeros;
            } else {
                ans += (zeros - 1) / 2;
                zeros = 0;
            }
        }
        return ans + zeros / 2 >= n; // Note that suffix zeros need not -1
    }
}
