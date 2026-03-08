class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         for(int k=j;k<n;k++){
        //             if(i<j && j<k && nums[i] < nums[j] &&  nums[j] < nums[k]){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){

            int a = nums[i];

            if(a<=first){
                first=a;
            }
            else if(a<=second){
                second = a;
            }else{
                return true;
            }
        }
        return false;
    }
}