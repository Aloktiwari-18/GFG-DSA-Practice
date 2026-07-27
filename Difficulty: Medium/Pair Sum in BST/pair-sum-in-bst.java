/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> arr= new ArrayList<>();
    public void helper(Node root, ArrayList<Integer> arr){
        if(root==null) return;
        helper(root.left,arr);
        arr.add(root.data);
        helper(root.right, arr);
    }
    boolean findTarget(Node root, int target) {
        // Write your code here
        helper(root, arr);
        int left=0;
        int right=arr.size()-1;
        while(left<right){
            int num= arr.get(left)+arr.get(right);
            if(num==target){
                return true;
            }
           else if(num>target){
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
}