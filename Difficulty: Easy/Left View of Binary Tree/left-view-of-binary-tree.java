/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
       Queue<Node> q= new LinkedList<>();
       q.add(root);
       ArrayList<Integer> ans= new ArrayList<>();
       while(!q.isEmpty()){
           int size=q.size();
           ArrayList<Integer> subList= new ArrayList<>();
           for(int i=0;i<size;i++){
               Node node= q.poll();
               subList.add(node.data);
               
               if(node.left!=null){
                   q.add(node.left);
               }
               if(node.right!=null){
                   q.add(node.right);
               }
               
               
               
           }
           ans.add(subList.get(0));
       }
       return ans;
        
    }
}