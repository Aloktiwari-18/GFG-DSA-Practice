// User function Template for Java

class Solution {
    
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);
        // System.out.print(arr);
        int left= 0;
        int right=m-1;
        int n= arr.size();
        int minDiff= Integer.MAX_VALUE;
        int result=0;
        
        while(right<n){
            result=arr.get(right)-arr.get(left);
            minDiff=Math.min(result, minDiff);
            left++;
            right++;
            
            
        }
        return minDiff;
        

        
        
        
        
       
        
    }
}