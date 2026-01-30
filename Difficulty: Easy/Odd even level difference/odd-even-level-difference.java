class Solution {
    int getLevelDiff(Node root) {
        if(root == null) return 0;

        Queue<Node> q = new LinkedList<>();
        int oddLevelSum = 0;
        int evenLevelSum = 0;

        q.add(root);
        boolean isOdd = true;   

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                Node curr = q.poll();

                if(isOdd){
                    oddLevelSum += curr.data;
                } else {
                    evenLevelSum += curr.data;
                }

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            isOdd = !isOdd;  
        }

        return oddLevelSum - evenLevelSum;
    }
}
