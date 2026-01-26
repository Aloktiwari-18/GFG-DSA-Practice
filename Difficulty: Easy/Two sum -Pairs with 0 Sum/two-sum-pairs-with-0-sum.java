class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum < 0) {
                left++;
            } 
            else if (sum > 0) {
                right--;
            } 
            else {
                ArrayList<Integer> subList = new ArrayList<>();
                subList.add(arr[left]);
                subList.add(arr[right]);
                ans.add(subList);
                
                int lVal = arr[left];
                int rVal = arr[right];
                
                while (left < right && arr[left] == lVal) left++;
                while (left < right && arr[right] == rVal) right--;
            }
        }
        return ans;
    }
}