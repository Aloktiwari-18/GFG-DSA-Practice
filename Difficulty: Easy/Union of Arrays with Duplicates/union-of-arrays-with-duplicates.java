class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> h= new HashSet<>();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int ele:a){
            h.add(ele);
            
        }
        for(int ele:b){
            h.add(ele);
        }
        for(int ele: h){
            arr.add(ele);
        }
        return arr;
    }
}