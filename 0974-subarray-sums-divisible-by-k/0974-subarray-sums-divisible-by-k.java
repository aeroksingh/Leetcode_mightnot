class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
       HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int sum = 0;
        int count = 0;
       for(int num : nums){

            sum += num;
            int req = sum%k;

            if(req<0){
                req+=k;
            }

            count += map.getOrDefault(req, 0);

            map.put(req,map.getOrDefault(req,0)+1);

       }
       return count;
    }
}