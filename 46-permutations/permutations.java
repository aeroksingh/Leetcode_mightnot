class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        find(nums,list);
        return res;
    }
    private void find(int[] nums, ArrayList<Integer> curr){
        if(curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i])) continue;

            curr.add(nums[i]);
            find(nums,curr);
            curr.remove(curr.size()-1);
        }

    }

}