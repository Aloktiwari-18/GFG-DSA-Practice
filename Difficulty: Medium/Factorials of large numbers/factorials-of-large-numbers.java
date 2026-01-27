// User function Template for Java

class Solution {
    
    public static void fact(ArrayList<Integer> ans, int num){
        int carry=0;
        for(int pos=ans.size()-1;pos>=0;pos--){
            int prod=ans.get(pos)*num +carry;
            ans.set(pos,prod%10);
            carry=prod/10;
        }
        while(carry>0){
            ans.add(0, carry%10);
            carry=carry/10;
            
            
        }
        
    }
    public static ArrayList<Integer> factorial(int n) {
        
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            fact(ans,i);
        }
        return ans;
        
    }
}