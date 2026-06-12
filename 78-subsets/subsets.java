class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        find(nums,0,new ArrayList<>());
        return res;
    }
    private void find(int[] nums,int index,ArrayList<Integer> curr){
        if(index == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        find(nums,index+1,curr);
        curr.remove(curr.size()-1);
        find(nums,index+1,curr);

    }
}