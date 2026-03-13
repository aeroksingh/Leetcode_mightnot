class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 0;
        long right = (long)1e18;

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (canReduce(mid, mountainHeight, workerTimes)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canReduce(long time, int mountainHeight, int[] workerTimes) {

        long reduced = 0;

        for (int w : workerTimes) {

            long low = 0, high = mountainHeight;

            while (low <= high) {

                long mid = (low + high) / 2;

                long required = (long)w * mid * (mid + 1) / 2;

                if (required <= time) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            reduced += high;

            if (reduced >= mountainHeight)
                return true;
        }

        return false;
    }
}
