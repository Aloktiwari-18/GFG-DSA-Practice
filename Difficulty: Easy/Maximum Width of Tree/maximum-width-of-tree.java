/* Structure of a Binary Tree
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    public int maxWidth(Node root) {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        int max= Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size= q.size();
            max=Math.max(max, size);
            for(int i=0;i<size;i++){
                Node curr= q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return max;
        //  code here
        
        
    }
}