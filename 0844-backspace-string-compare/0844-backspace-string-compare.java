class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) != '#') {
                sb2.append(t.charAt(i));
            } else {
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            }
        }

        return sb.toString().equals(sb2.toString());
    }
}