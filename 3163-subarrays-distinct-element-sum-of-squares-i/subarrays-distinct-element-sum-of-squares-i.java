class Solution {

    public int sumCounts(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        int i=0;
        for(int n: nums){
            arr[i++] = n;
        }
        int total = 0;
        for(int start=0;start<nums.size();start++){
            for(int end = start+1;end<=nums.size();end++){
                int[] subarray = Arrays.copyOfRange(arr, start, end);
                total += subunqiue(subarray);
            }
        }

        return total;
    }
    
    private int subunqiue(int[] nums){
        // just count the unqiue in subarray and return the square of it
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        sum += set.size();
        return sum*sum;
    }
}