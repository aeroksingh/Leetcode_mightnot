class Solution {
    public int hammingDistance(int x, int y) {

        String str1 = Integer.toBinaryString(x);
        String str2 = Integer.toBinaryString(y);

        int n = Math.max(str1.length(), str2.length());

        int count = 0;

        for (int i = 0; i < n; i++) {

            int index1 = str1.length() - 1 - i;
            int index2 = str2.length() - 1 - i;

            char bit1 = index1 >= 0 ? str1.charAt(index1) : '0';
            char bit2 = index2 >= 0 ? str2.charAt(index2) : '0';

            if (bit1 != bit2) {
                count++;
            }
        }

        return count;
    }
}