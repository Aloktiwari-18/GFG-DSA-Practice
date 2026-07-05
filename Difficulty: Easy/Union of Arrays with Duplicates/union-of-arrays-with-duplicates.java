class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> s= new HashSet<>();
        ArrayList<Integer> r= new ArrayList<>();
        for(int e:a){
            s.add(e);
        }
        for(int e:b){
            s.add(e);
        }
         for(int e:s){
            r.add(e);
        }
        return r;
    }
}