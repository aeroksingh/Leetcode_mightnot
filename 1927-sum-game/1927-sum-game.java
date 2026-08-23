class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                leftQ++;
            } else {
                leftSum += ch - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                rightQ++;
            } else {
                rightSum += ch - '0';
            }
        }

        int sumDiff = leftSum - rightSum;
        int qDiff = leftQ - rightQ;

        if (qDiff % 2 != 0) {
            return true;
        }

        return sumDiff != -9 * (qDiff / 2);
    }
}