/* Structure of Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public void markedParent(Node root, HashMap<Node, Node> mp){
        Queue<Node>q= new LinkedList<>();
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
    public Node find(Node root,int target){
    if(root==null) return null;

    if(root.data==target)
        return root;

    Node left=find(root.left,target);
    if(left!=null) return left;

    return find(root.right,target);
}
    public ArrayList<Integer> kDistanceNodes(Node root, int target, int k) {
        // code here
        HashMap<Node, Node> mp= new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        markedParent(root, mp);
        Node targetNode=find(root, target);
        
        HashMap<Node ,Boolean> vis= new HashMap<>();
        q.add(targetNode);
        vis.put(targetNode, true);
        int currLevel=0;
        while(q.size()>0){
            if(currLevel==k) break;
            currLevel++;
            int s=q.size();
            for(int i=0;i<s;i++){
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
        ArrayList<Integer> ans= new ArrayList<>();
        while(q.size()>0){
            ans.add(q.poll().data);
        }
        Collections.sort(ans);
        return ans;
        
        
    }
}