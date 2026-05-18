class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums,0,curr);
        return res;
    }
    private void subsets(int nums[], int index, ArrayList<Integer>curr){
        res.add(new ArrayList<>(curr));
       
        for(int i =index;i<nums.length;i++){

            if(index<i && nums[i] == nums[i-1]) continue;
        
            curr.add(nums[i]);
            subsets(nums,i+1,curr);
            curr.remove(curr.size()-1);

        }
        

    }
}