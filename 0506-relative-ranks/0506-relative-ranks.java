class Solution {
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> score[b] - score[a]);

        // Store indexes
        for (int i = 0; i < score.length; i++) {
            pq.add(i);
        }

        String[] str = new String[score.length];

        int rank = 1;

        while (!pq.isEmpty()) {

            int index = pq.poll();

            if (rank == 1) {
                str[index] = "Gold Medal";
            }
            else if (rank == 2) {
                str[index] = "Silver Medal";
            }
            else if (rank == 3) {
                str[index] = "Bronze Medal";
            }
            else {
                str[index] = String.valueOf(rank);
            }

            rank++;
        }

        return str;
    }
}