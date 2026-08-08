class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a,b)-> {
            if(a[0]==b[0]){
            return Integer.compare(a[1],b[1]);
        }
        else{
            return Integer.compare(a[0],b[0]);
        }});
        
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
        ArrayList<Integer> subRes= new ArrayList<>();
        subRes.add(arr[0][0]);
        subRes.add(arr[0][1]);
        
        res.add(subRes);
        for(int i=1;i<arr.length;i++){
            ArrayList<Integer> prev= res.get(res.size()-1);
            int a1=arr[i][0];
            int a2= arr[i][1];
            
            
            
            if(prev.get(1)>=a1){
                prev.set(1, Math.max(prev.get(1), a2));
               
            }else{
                ArrayList<Integer> curr= new ArrayList<>();
                curr.add(a1);
                curr.add(a2);
                res.add(curr);
            }
            
            
            
        }
        return res;
    }
}