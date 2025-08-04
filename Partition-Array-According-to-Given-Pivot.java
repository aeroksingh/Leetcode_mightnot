class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                l1.add(nums[i]);
            } else if (nums[i] == pivot)
                l2.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot)
                l2.add(nums[i]);
        }
        l1.addAll(l2);

        int[] arr = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            arr[i] = l1.get(i);
        }
        return arr;
    }
}