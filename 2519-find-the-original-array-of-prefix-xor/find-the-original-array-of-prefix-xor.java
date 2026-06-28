class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] ans = new int[n];
        ans[0] = pref[0];
        int a = 0;
        for(int i=1;i<n;i++)
        {
            a ^= ans[i-1];
            ans[i] = a ^ pref[i];
        }
        return ans;
    }
}