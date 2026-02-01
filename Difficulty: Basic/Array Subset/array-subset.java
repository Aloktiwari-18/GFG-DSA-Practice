
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map= new HashMap<>();
        
        
        int n1=a.length;
        int n2=b.length;
        for(int i=0;i<n1;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        
        for(int x:b){
            if(!map.containsKey(x)  || map.get(x)==0){
                return false;
            }
            map.put(x,map.get(x)-1);
        }
        

        

        return true;
        
        
        
        
    }
}
