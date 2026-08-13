class Solution {
    public int[] sortEvenOdd(int[] nums) {
       // List<String> list = new ArrayList<>(Arrays.asList(array));
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
       }
       Collections.sort(list1);
       Collections.sort(list2,Collections.reverseOrder());

        int k=0;
        int l=0;
       for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = list1.get(k++);
            }
            else{
                nums[i] = list2.get(l++);
            }
       }
       return nums;
    }
}