class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        Map<Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        int m = operations.length;
        for(int i =0;i<n;i++){
            hash.put(nums[i], i);
        }

       for(int[] op : operations){
            int oldval = op[0];
            int newval = op[1];

            int index = hash.get(oldval);
            nums[index] = newval;
            hash.remove(oldval);
            hash.put(newval,index);

       }
        return nums;
    }
}