class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue() == 1){
                list.add(m.getKey());
            }
        }
        int[] arr = new int[list.size()];
        int i=0;
        for(int e: list){
            arr[i++] = e;
        }
        return arr;
    }
}