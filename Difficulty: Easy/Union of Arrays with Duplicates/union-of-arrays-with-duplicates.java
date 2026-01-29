class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code< here
        HashSet<Integer> a1= new HashSet<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int ele1:a){
            a1.add(ele1);
        }
        for(int ele2:b){
            a1.add(ele2);
            
        }
        for(int num:a1){
            ans.add(num);
        }
        return ans;
        
    }
}