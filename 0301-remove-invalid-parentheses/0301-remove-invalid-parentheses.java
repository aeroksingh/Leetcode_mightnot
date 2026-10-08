class Solution {

    Set<String> set = new HashSet<>();
    int maxLen = 0;

    public List<String> removeInvalidParentheses(String s) {

        StringBuilder curr = new StringBuilder();

        solve(0, curr, 0, s);

        return new ArrayList<>(set);
    }

    private void solve(int i, StringBuilder curr, int count, String s) {

        // Invalid prefix
        if (count < 0) {
            return;
        }

        // Reached end
        if (i == s.length()) {

            if (count == 0) {

                if (curr.length() > maxLen) {
                    maxLen = curr.length();
                    set.clear();
                    set.add(curr.toString());
                }
                else if (curr.length() == maxLen) {
                    set.add(curr.toString());
                }
            }

            return;
        }

        char ch = s.charAt(i);

        // Normal character
        if (ch != '(' && ch != ')') {

            curr.append(ch);

            solve(i + 1, curr, count, s);

            curr.deleteCharAt(curr.length() - 1);

            return;
        }

        solve(i + 1, curr, count, s);
        curr.append(ch);

        if (ch == '(') {
            solve(i + 1, curr, count + 1, s);
        }
        else {
            solve(i + 1, curr, count - 1, s);
        }

        curr.deleteCharAt(curr.length() - 1);
    }
}