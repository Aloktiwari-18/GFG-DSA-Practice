class Solution {
    

    public int leftcount(Node root){
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
    public int rightcount(Node root){
        int h=0;
        while(root!=null){
            h++;
            root=root.right;
        }
        return h;
    }
    public int countNodes(Node root) {
        // code here
        if(root==null) return 0;
       int lh= leftcount(root);
        int rh=rightcount(root);
        if(lh==rh){
            return (1<<lh)-1;
            
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}