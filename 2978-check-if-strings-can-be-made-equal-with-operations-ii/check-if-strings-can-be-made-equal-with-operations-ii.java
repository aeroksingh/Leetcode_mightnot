class Solution {
    public boolean checkStrings(String s1, String s2) {
        Map<Character, Integer> even = new HashMap<>();
        Map<Character, Integer> odd = new HashMap<>();
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { //means at even 
                even.put(s1.charAt(i), even.getOrDefault(s1.charAt(i), 0) + 1);
            } else {
                odd.put(s1.charAt(i), odd.getOrDefault(s1.charAt(i), 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { //means at even 
                even.put(s2.charAt(i), even.getOrDefault(s2.charAt(i), 0) - 1);
            } else {
                odd.put(s2.charAt(i), odd.getOrDefault(s2.charAt(i), 0) - 1);
            }
        }

        for (int val : even.values()) {
            if (val != 0)
                return false;
        }

        for (int val : odd.values()) {
            if (val != 0)
                return false;
        }

        return true;

    }
}