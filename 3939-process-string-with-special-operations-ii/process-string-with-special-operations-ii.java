class Solution {
    public char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n];
        long cur = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                cur++;
            } else if (ch == '*') {
                cur = Math.max(0, cur - 1);
            } else if (ch == '#') {
                cur = Math.min((long)1e18, cur * 2);
            } 

            len[i] = cur;
        }

        if (k >= cur) return '.';

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            long prev = (i == 0) ? 0 : len[i - 1];
            long curr = len[i];

            if (ch == '%') {
                k = curr - 1 - k;
            }
            else if (ch == '#') {
                if (k >= prev) {
                    k -= prev;
                }
            }
            else if (ch == '*') {
                // nothing to do
            }
            else {
                if (k == prev) {
                    return ch;
                }
            }
        }

        return '.';
    }
}