class Solution {
    public static int countBitsFlip(int a, int b) {
        
      int num=(a^b);
      return Integer.bitCount(num);
        
    }
}
         

