class Solution {
    public int maximumCandies(int[] candies, long k) {

        int low = 1;
        int high = 0;

        for (int c : candies) {
            high = Math.max(high, c);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long children = 0;

            for (int c : candies) {
                children += c / mid;
            }

            if (children >= k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    private long findp(int[] candies, int mid) {
    long children = 0;

    for (int pile : candies) {
        children += pile / mid;
    }

    return children;
}
}
