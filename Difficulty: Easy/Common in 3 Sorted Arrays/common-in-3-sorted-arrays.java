// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        int p=arr1.size();
        int q= arr2.size();
        int r= arr3.size();
       int i=0;
       int j=0;
       int k=0;
       int neg=-1;
       List<Integer> ans= new ArrayList<>();
       while(i<p && j<q && k<r){
           int a= arr1.get(i);
           int b= arr2.get(j);
           int c= arr3.get(k);
           
           
           if(a==b && b==c){
               if(ans.size()==0 || ans.get(ans.size()-1)!=a){
                   ans.add(a);
               }
               i++;
           j++;
           k++;
           }
           else if(a<b){
               i++;
           }
           else if(b<c){
               j++;
           }else{
               k++;
           }
           
       }
       if(ans.size()==0){
           ans.add(-1);
       
       }
       return ans;
       
        
    }
}