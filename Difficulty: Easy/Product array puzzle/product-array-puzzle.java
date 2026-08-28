
class Solution {
    public static int[] productExceptSelf(int arr[]) {

        int product = 1;
        int zeroCount = 0;

        for (int ele : arr) {
            if (ele == 0) {
                zeroCount++;
            } else {
                product *= ele;
            }
        }

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (zeroCount > 1) {
                ans[i] = 0;
            }
            else if (zeroCount == 1) {
                if (arr[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            }
            else {
                ans[i] = product / arr[i];
            }
        }

        return ans;
    }
}