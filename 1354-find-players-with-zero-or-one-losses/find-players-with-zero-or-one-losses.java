class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> left = new ArrayList<>();
        List<Integer> rightans = new ArrayList<>();

        HashMap<Integer, Integer> right = new HashMap<>();
        HashSet<Integer> leftSet = new HashSet<>();

        int m = matches.length;

        for (int i = 0; i < m; i++) {
            right.put(matches[i][1], right.getOrDefault(matches[i][1], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : right.entrySet()) {
            if (entry.getValue() == 1) {
                rightans.add(entry.getKey());
            }
        }

        for (int i = 0; i < m; i++) {
            if (!right.containsKey(matches[i][0])) {
                leftSet.add(matches[i][0]);
            }
        }

        left.addAll(leftSet);

        Collections.sort(left);
        Collections.sort(rightans);

        res.add(left);
        res.add(rightans);

        return res;
    }
}