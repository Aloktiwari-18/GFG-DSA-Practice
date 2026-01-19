class Solution {
    public ArrayList<ArrayList<String>> findSequences(String startWord,
                                                      String targetWord,
                                                      String[] wordList) {

        Set<String> set = new HashSet<>(Arrays.asList(wordList));
        Queue<List<String>> q = new LinkedList<>();

        List<String> start = new ArrayList<>();
        start.add(startWord);
        q.add(start);

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        int level = 1;
        int minLevel = Integer.MAX_VALUE;

        List<String> usedOnLevel = new ArrayList<>();

        while (!q.isEmpty()) {
            List<String> path = q.poll();

            if (path.size() > level) {
                for (String word : usedOnLevel) {
                    set.remove(word);
                }
                usedOnLevel.clear();
                level = path.size();

                if (level > minLevel) break;
            }

            String lastWord = path.get(path.size() - 1);

            if (lastWord.equals(targetWord)) {
                minLevel = path.size();
                ans.add(new ArrayList<>(path));
                continue;
            }

            char[] arr = lastWord.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    arr[i] = c;
                    String next = new String(arr);

                    if (set.contains(next)) {
                        List<String> newPath = new ArrayList<>(path);
                        newPath.add(next);
                        q.add(newPath);
                        usedOnLevel.add(next);
                    }
                }
                arr[i] = original;
            }
        }

        return ans;
    }
}
