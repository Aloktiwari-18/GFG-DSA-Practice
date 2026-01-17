class Solution {

    private List<Integer> topoSort(int V, List<List<Integer>> adj) {
        int indegree[] = new int[V];

        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        List<Integer> topo = new ArrayList<>();

        while (!q.isEmpty()) {
            int top = q.poll();
            topo.add(top);

            for (int next : adj.get(top)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    q.add(next);
                }
            }
        }
        return topo;
    }

    public String findOrder(String[] words) {

        Set<Character> set = new HashSet<>();
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                set.add(ch);
            }
        }

        int K = set.size();
        int N = words.length;

        
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Character> rev = new HashMap<>();
        int idx = 0;
        for (char ch : set) {
            map.put(ch, idx);
            rev.put(idx, ch);
            idx++;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adj.add(new ArrayList<>());
        }
        boolean found=false;
        for (int i = 0; i < N - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int len = Math.min(s1.length(), s2.length());
            for (int ptr = 0; ptr < len; ptr++) {
                if (s1.charAt(ptr) != s2.charAt(ptr)) {
                    adj.get(map.get(s1.charAt(ptr)))
                       .add(map.get(s2.charAt(ptr)));
                       found=true;
                    break;
                }
            }
            if (!found && s1.length() > s2.length()) {
        return "";   // INVALID
    }
        }

        List<Integer> topo = topoSort(K, adj);

        


        if (topo.size() < K) {
            return "";   
        }

        StringBuilder ans = new StringBuilder("");
        for (int it : topo) {
            ans.append(rev.get(it));
        }

        return ans.toString();
    }
}
