class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxsum =0;

        for(int g: gain)
        {
            sum +=g;
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}