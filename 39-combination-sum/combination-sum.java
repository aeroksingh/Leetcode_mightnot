class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates,target,0,new ArrayList<>());
        return res;
    }
    private void find(int[] can, int target,int index, ArrayList<Integer>list){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(index == can.length || target<0) return;

        for(int i=index;i<can.length;i++){
            
            list.add(can[i]);
            find(can,target-can[i],i,list);
            list.remove(list.size()-1);
            // find(can,i+1,currTarget,list);


        }


    }
}