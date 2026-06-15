class Solution {
    public int minCostToMoveChips(int[] position) {
        int ans = 0;
        int[] same = new int[position.length];
        int max = 0;
        int even =0;int odd = 0;
        for(int i=0;i<position.length;i++){
            if(position[i] % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }

        ans += 1*Math.min(even,odd);
        return ans;
    }
}