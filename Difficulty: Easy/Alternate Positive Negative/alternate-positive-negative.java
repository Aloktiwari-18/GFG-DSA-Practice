// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg= new ArrayList<>();
        int n= arr.size();
        
        for(int i=0;i<n;i++){
            if(arr.get(i)<0){
                neg.add(arr.get(i));
            }else{
                pos.add(arr.get(i));
            }
            
        }

        
    int posIdx=0;
    int negIdx=0;
    int i=0;
    
    
    while(posIdx<pos.size() && negIdx<neg.size()){
        if(i%2==0){
            arr.set(i++,pos.get(posIdx++));
        }else{
            arr.set(i++, neg.get(negIdx++));
        }
    }
    
    while(posIdx<pos.size()){
        arr.set(i++, pos.get(posIdx++));
    }
    
    
    while(negIdx<neg.size()){
        arr.set(i++, neg.get(negIdx++));
    }
        
        
        
        
        
        
        

    
        
    }
}