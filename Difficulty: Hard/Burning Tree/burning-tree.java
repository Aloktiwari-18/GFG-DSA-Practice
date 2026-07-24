/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void markedParent(Node root, HashMap<Node, Node> mp){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int s= q.size();
            for(int i=0;i<s;i++){
                Node curr= q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                    mp.put(curr.left, curr);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                    mp.put(curr.right, curr);
                }
            }
        }
    }
     Node find(Node root, int target){
         if(root==null) return null;
        if(root.data==target){
            return root;
        }
        Node left= find(root.left, target);
        if(left!=null){
            return left;
        }
        return find(root.right, target);
    }
    
    public int minTime(Node root, int target) {
        // code here
        Queue<Node> q= new LinkedList<>();
        HashMap<Node, Node> mp= new HashMap<>();
        markedParent(root, mp);
        Node targetNode = find(root, target);
        q.add(targetNode);
        HashMap<Node, Boolean> vis= new HashMap<>();
        vis.put(targetNode, true);
        int time=0;
        while(q.size()>0){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                Node curr= q.poll();
                if(curr.left!=null && vis.get(curr.left)==null){
                    q.add(curr.left);
                    vis.put(curr.left, true);
                }
                if(curr.right!=null && vis.get(curr.right)==null){
                    q.add(curr.right);
                    vis.put(curr.right, true);
                }
                if(mp.get(curr)!=null && vis.get(mp.get(curr))==null){
                    q.add(mp.get(curr));
                    vis.put(mp.get(curr), true);
                }
            }
        }
        return time-1;
        
    }
} 