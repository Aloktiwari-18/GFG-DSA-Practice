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

class Pair{
    Node node;
    int hd;
    
    Pair(Node _node, int _hd){
        this.node= _node;
        this.hd= _hd;
    }
}
class Solution {
    
    public ArrayList<Integer> topView(Node root) {
        Queue<Pair> q= new LinkedList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        TreeMap<Integer, Integer> map= new TreeMap<>();
        if(root==null) return ans;
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair it= q.poll();
            int hd= it.hd;
            Node temp= it.node;
            
            if(map.get(hd)==null){
                map.put(hd, temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }            
            
            
            
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
        
        // code here
        
    }
}