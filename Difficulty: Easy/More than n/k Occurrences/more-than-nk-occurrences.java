class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        int n=arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++){
            int num=arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        int count=0;
        
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()>n/k){
                ans=entry.getKey();
                count++;
                
            }
        }
        return count;
        
    }
}