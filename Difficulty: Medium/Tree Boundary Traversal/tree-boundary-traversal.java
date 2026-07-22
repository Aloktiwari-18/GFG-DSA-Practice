/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    ArrayList<Integer> left= new ArrayList<>();
    ArrayList<Integer> right= new ArrayList<>();
    ArrayList<Integer> leaf= new ArrayList<>();
    
    public void leftBound(Node root){
        
        
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            return;
        }
        left.add(root.data);
        if(root.left!=null){
            leftBound(root.left);
        }else{
            leftBound(root.right);
        }
        
        
        
    }
    
    public void leafBound(Node root){
        if(root==null) return;
        
        
        if(root.left==null && root.right==null){
            leaf.add(root.data);
            return;
            
        }
        leafBound(root.left);
        leafBound(root.right);
        
    }
    
    public void rightBound(Node root){
        if(root==null) return;
        
        
        if(root.left==null && root.right==null){
            return;
        }
        
        right.add(root.data);
        if(root.right!=null){
            rightBound(root.right);
        }else{
            rightBound(root.left);
        }
        
        
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
    
    ArrayList<Integer> ans= new ArrayList<>();
    
    if(root==null) return ans;
     leftBound(root.left);
     leafBound(root);
     rightBound(root.right);
    
     int l= left.size();
     int lf= leaf.size();
     int r= right.size();
     
     
     ans.add(root.data);
     for(int x:left){
         ans.add(x);
     }
     for(int x: leaf){
         if(x!=root.data) ans.add(x);
     }
     
     for(int i=right.size()-1;i>=0;i--){
         ans.add(right.get(i));
     }
        
        return ans;
        
    }
}