class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            map.put(nums[i], i);
        }
        Arrays.sort(arr, (a, b) -> {
            int x = sum(a);
            int y = sum(b);

            if (x != y)
                return Integer.compare(x, y);

            return Integer.compare(a, b);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || map.get(arr[i]) == i)
                continue;

            int j = i;
            int size = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = map.get(arr[j]);
                size++;
            }

            swaps += size - 1;
        }

        return swaps;
    }

    private int sum(int n) {
        int s = 0;

        while (n > 0) {
            s += n % 10;
            n /= 10;
        }

        return s;
    }
}