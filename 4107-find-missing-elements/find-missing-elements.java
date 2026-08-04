class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];

        int k=0;
        for(int i= min;i<=max;i++){
            
            while(k<nums.length && nums[k] < i){
                k++;
            }
            if(k >= nums.length || nums[k] != i) list.add(i);
        }
        return list;
    }
}