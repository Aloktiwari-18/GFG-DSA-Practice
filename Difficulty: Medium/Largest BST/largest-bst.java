class Solution {

    static class NodeInfo {
        boolean isBST;
        int size;
        int min;
        int max;
        NodeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    
    public int largestBst(Node root) {
        return solve(root).size;
    }
    private NodeInfo solve(Node root) {
        if (root == null) {
            return new NodeInfo(true ,  0,  Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
        NodeInfo left = solve(root.left);
        NodeInfo right = solve(root.right);
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            int size = left.size + right.size + 1;
            int min = Math.min(root.data, left.min);
            int max = Math.max(root.data, right.max);
            return new NodeInfo(true, size, min, max);
            
        }
        return new NodeInfo(false, Math.max(left.size, right.size), 0, 0);
    }
}