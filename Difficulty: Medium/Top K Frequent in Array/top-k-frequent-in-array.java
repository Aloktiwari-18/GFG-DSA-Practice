class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(Pair t){
        if(this.freq== t.freq)  return this.ele-t.ele;
        return this.freq-t.freq;
    }
    
}

class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele: arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
            
        }
        ArrayList<Integer> ans= new ArrayList<>();
        // Code here
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int ele: map.keySet()){
            int freq= map.get(ele);
            pq.add(new Pair(ele, freq));
            if(pq.size()>k) pq.remove();
        }
        
        while(pq.size()>0){
            Pair top= pq.remove();
            ans.add(top.ele);
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
