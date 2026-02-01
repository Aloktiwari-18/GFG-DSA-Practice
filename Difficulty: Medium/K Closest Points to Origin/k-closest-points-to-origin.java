class Pair implements Comparable <Pair>{
    int dist;
    int x;
    int y;
    
    Pair(int dist, int x, int y){
        this.dist=dist;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Pair t){
        return t.dist-this.dist; 
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        // code here
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        for(int [] point:points){
            int x= point[0];
            int y=point[1];
            
            int dist=x*x + y*y;
            pq.add(new Pair(dist,x,y));
            
            if(pq.size()>k) pq.poll();
            
            
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       
        for(int i=0;i<k;i++){
            Pair top=pq.remove();
             ArrayList<Integer> subAns= new ArrayList<>();
            subAns.add(top.x);
            subAns.add(top.y);
            ans.add(subAns);
        }
        return ans;
        
    }
}