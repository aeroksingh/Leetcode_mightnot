class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int left = 1;
        int right = 0;

        for (int e : piles) {
            right = Math.max(right, e);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long total = 0;
            for (int p : piles) {
                total += (mid + p - 1) / mid;
            }
            if (total <= h) {
                right = mid-1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }
}