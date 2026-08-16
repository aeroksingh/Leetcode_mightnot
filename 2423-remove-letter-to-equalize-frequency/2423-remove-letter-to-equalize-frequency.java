class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {

                freq[i] -= 1;
                boolean flag = check(freq);
                if (flag) {
                    return true;
                }
                freq[i] += 1;
            }
        }
        return false;

    }

    private boolean check(int[] freq) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                set.add(freq[i]);
            }
        }

        return set.size() == 1;
    }
}