class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        find(candidates,target,0,new ArrayList<>());
        return res;
    }
    private void find(int[] can, int target, int index,ArrayList<Integer> curr){
        if(target ==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(index == can.length|| target <0) return;

        for(int i=index;i<can.length;i++){
            if (i > index && can[i] == can[i - 1]) {
                continue;
            }
            if (can[i] > target) {
                break;
            }
            curr.add(can[i]);
            find(can,target-can[i],i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}