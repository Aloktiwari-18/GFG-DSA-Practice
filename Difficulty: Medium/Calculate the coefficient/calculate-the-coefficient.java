class Solution {
    public int permutationCoeff(int n, int k) {
        
        long MOD = 1000000007;
        long ans = 1;
        
        for(int i = 0; i < k; i++){
            ans = (ans * (n - i)) % MOD;
        }
        
        return (int)ans;
    }
}