
import java.util.*;

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int MOD = 1_000_000_007;
        TreeSet<Integer> set = new TreeSet<>();

        long sum = 0;
        long maxReduction = 0;

        for (int x : nums1) {
            set.add(x);
        }

        for (int i = 0; i < nums1.length; i++) {
            int a = nums1[i];
            int b = nums2[i];

            int diff = Math.abs(a - b);
            sum += diff;

            Integer ceil = set.ceiling(b);
            Integer floor = set.floor(b);

            if (ceil != null) {
                maxReduction = Math.max(
                    maxReduction, diff - Math.abs(ceil - b)
                );
            }

            if (floor != null) {
                maxReduction = Math.max(
                    maxReduction, diff - Math.abs(floor - b)
                );
            }
        }

        return (int) ((sum - maxReduction) % MOD);
    }
}
