class Solution {
    public int maxVowels(String s, int k) {

        int curr = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                curr++;
            }
        }

        max = curr;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                curr--;
            }
            if (isVowel(s.charAt(i))) {
                curr++;
            }

            max = Math.max(max, curr);
        }

        return max;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}