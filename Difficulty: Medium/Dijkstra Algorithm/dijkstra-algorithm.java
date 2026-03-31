class Solution {
    class Pair{
        int node;
        int weight;
        Pair(int node , int weight){
            this.node=node;
            this.weight= weight;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        ArrayList<ArrayList<Pair>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i= 0; i<edges.length; i++){
            int u= edges[i][0];
            int v= edges[i][1];
            int w= edges[i][2];
            
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b) -> a.weight - b.weight);
        
        int dist[]= new int[V];
        for(int i=0;i<V;i++){
            dist[i]= Integer.MAX_VALUE;
        }
        dist[src]=0;
        pq.add(new Pair(src,0));
        
        while(!pq.isEmpty()){
            Pair curr= pq.poll();
            int node= curr.node;
            int currDist= curr.weight;
            
            
            for(Pair neighbour: adj.get(node)){
                int weight= neighbour.weight;
                int adjNode = neighbour.node;
                
                if(currDist+ weight < dist[adjNode]){
                    dist[adjNode]= currDist+weight;
                    
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
                
            }
        }
        return dist;
        
            
    }
}