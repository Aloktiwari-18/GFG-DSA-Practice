class Solution {
    public int findSum(String s) {
        // code here
        int sum=0;
    String num="";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num+=s.charAt(i);
            }else{
                if(num!=""){
                    sum+=Integer.parseInt(num);
                    num="";
                }
            }
            
             
            
        }
        if(num!=""){
            sum+=Integer.parseInt(num);
                    num="";
            
            
        }
        return sum;
        
    }
}