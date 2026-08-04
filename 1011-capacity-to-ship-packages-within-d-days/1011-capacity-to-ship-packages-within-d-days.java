class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int e: weights){
            left = Math.max(e,left);
            right += e;
        }

        while(left<=right){
            int mid = left + (right - left)/2;
            int curr = 0;
            int req = 1;
            for(int e: weights){
                
                if(e+curr > mid ){
                    req++;
                    curr = e;
                }else{
                    curr += e;
                }
            }

            if(req <= days){
                right = mid-1;
            }else left = mid+1;
        }
        return left;





    }
}