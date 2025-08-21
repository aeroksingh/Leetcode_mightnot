class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            --count[ch - 'a'];
            if (count[ch - 'a'] < 0)
                return false;
        }

        return true;
    }
}