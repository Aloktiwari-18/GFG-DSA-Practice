/*
Definition for Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> arr= new ArrayList<>();
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        boolean flag= true;
        while(q.size()>0){
            List<Integer> list= new ArrayList<>();
            
            int size= q.size();
            for(int i=0;i<size;i++){
                Node root1= q.poll();
                
                if(root1.left!=null) q.add(root1.left);
                if(root1.right!=null) q.add(root1.right);
                if(flag){
                    list.add(root1.data);
                    
                }else{
                    list.add(0,root1.data);
                }
                 
                
            }
            
            
            for(int i=0;i<list.size();i++){
                arr.add(list.get(i));
            }
            flag=!flag;
            
            
            
            
        }
        return arr;
        
    }
}