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
class Pair{
    Node node;
    int hd;
    Pair(Node _node,int _hd){
        this.node=_node;
        this.hd=_hd;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
         ArrayList<Integer> ans= new ArrayList<>();
        Queue<Pair> q= new LinkedList<>();
        TreeMap<Integer, Integer> map= new TreeMap<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair it= q.peek();
            Node node= it.node;
            int hd=it.hd;
            q.poll();
            map.put(hd, node.data);

            if(node.left!=null){
                q.add(new Pair(node.left, hd-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right, hd+1));
            }
            
            
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
    }
}