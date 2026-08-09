class Solution {
    public List<Integer> minSubsequence(int[] nums) {

        Arrays.sort(nums);

        int total = 0;

        for (int num : nums) {
            total += num;
        }

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            sum += nums[i];
            list.add(nums[i]);

            if (sum > total - sum) {
                break;
            }
        }

        return list;
    }
}