
class Solution {

    private int atMostK(String s, int k) {
        int n = s.length();
        int[] vis = new int[26];
        int i = 0, count = 0, ans = 0;

        for (int j = 0; j < n; j++) {

            if (vis[s.charAt(j) - 'a'] == 0)
                count++;

            vis[s.charAt(j) - 'a']++;

            while (count > k) {
                vis[s.charAt(i) - 'a']--;
                if (vis[s.charAt(i) - 'a'] == 0)
                    count--;
                i++;
            }

            ans += (j - i + 1);
        }

        return ans;
    }

    public int countSubstr(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }
}
