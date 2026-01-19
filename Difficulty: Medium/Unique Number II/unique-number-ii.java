class Solution {
    public int[] singleNum(int[] arr) {
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        int rsmb=xor & (-xor);
        int a=0;
        int b=0;
        
        for(int i=0;i<arr.length;i++){
            if((arr[i] & rsmb)!=0){
                a^=arr[i];
                
            }else{
                b^=arr[i];
            }
        }
        if(a<b){
            return new int[]{a,b};
        }else{
            return new int[]{b,a};
        }
        
        
    }
}