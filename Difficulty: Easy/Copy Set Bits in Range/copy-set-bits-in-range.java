class Solution {
    static int setSetBit(int x, int y, int l, int r) {
        y = y >> l-1;
        while (l <= r && y > 0) {
            if ((y & 1) == 1) {
                x = x | (1 << (l - 1));
            }
            y = y >> 1;   
            l++;
        }
        return x;
    }
}
