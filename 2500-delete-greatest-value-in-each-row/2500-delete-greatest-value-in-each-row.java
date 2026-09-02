class Solution {
    public int deleteGreatestValue(int[][] grid) {

        int max = 0;

        // Store each row in a max heap
        PriorityQueue<Integer>[] pq = new PriorityQueue[grid.length];

        for(int i = 0; i < grid.length; i++) {

            pq[i] = new PriorityQueue<>((a, b) -> b - a);

            for(int j = 0; j < grid[0].length; j++) {
                pq[i].add(grid[i][j]);
            }
        }

        // Every round, remove the greatest from each row
        for(int j = 0; j < grid[0].length; j++) {

            int count = 0;

            for(int i = 0; i < grid.length; i++) {

                int value = pq[i].poll();

                count = Math.max(count, value);
            }

            max += count;
        }

        return max;
    }
}