class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ArrayList<Integer> subMap=new ArrayList<>();
            int  key= entry.getKey();
            int val=entry.getValue();
            subMap.add(key);
            subMap.add(val);
            ans.add(subMap);
        }
        Collections.sort(ans, (a, b)->{
            
        
            return Integer.compare(a.get(0), b.get(0));
        });
        return ans;
    }
}