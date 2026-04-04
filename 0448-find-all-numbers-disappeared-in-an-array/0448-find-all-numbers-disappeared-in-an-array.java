class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int[] ref=new int[n];
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=nums[i]-1;
            ref[index]=1;
        }
        for(int i=0;i<n;i++){
            if(ref[i]==0){
               res.add(i+1);
            }
        }
        return res;
    }
}