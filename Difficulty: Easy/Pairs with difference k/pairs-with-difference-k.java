import java.util.*;

class Solution {
    int countPairs(int[] arr, int k) {
        
        HashMap<Integer,Integer> freq = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
            set.add(num);
        }
        
        int count = 0;
        
        for(int num : set){
            if(set.contains(num + k)){
                count += freq.get(num) * freq.get(num + k);
            }
        }
        
        return count;
    }
}