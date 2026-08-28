class Solution {
    public String minWindow(String s, String t) {

        int n1 = s.length();
        int n2 = t.length();

        if (n2 > n1) {
            return "";
        }

        int[] freq2 = new int[128];
        int[] freq = new int[128];

        // Frequency required from t
        for (int i = 0; i < n2; i++) {
            freq2[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;

        int count = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < n1) {

            char ch = s.charAt(right);
            freq[ch]++;

            // This character was still needed
            if (freq[ch] <= freq2[ch]) {
                count++;
            }

            // Window is valid
            while (count == n2) {

                // Store minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);
                freq[leftChar]--;

                // If removing it makes the window invalid
                if (freq[leftChar] < freq2[leftChar]) {
                    count--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}