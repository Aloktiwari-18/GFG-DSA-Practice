import java.util.*;

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int ele : arr){
            int val = ele % k;
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        long pair = 0;
        
        long zeroCount = map.getOrDefault(0,0);
        pair += zeroCount * (zeroCount - 1) / 2;
        map.remove(0);
        
        if(k % 2 == 0 && map.containsKey(k/2)){
            long halfCount = map.get(k/2);
            pair += halfCount * (halfCount - 1) / 2;
            map.remove(k/2);
        }
        
        for(int key : new HashSet<>(map.keySet())){
            
            int rem = k - key;
            
            if(map.containsKey(rem)){
                pair += (long)map.get(key) * map.get(rem);
                map.remove(key);
                map.remove(rem);
            }
        }
        
        return pair;
    }
}