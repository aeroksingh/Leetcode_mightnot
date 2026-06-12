class Solution {

    List<String> res = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        backtrack(s, 0, new StringBuilder());
        return res;
    }

    private void backtrack(String s, int idx, StringBuilder path) {

        if (idx == s.length()) {
            res.add(path.toString());
            return;
        }

        char ch = s.charAt(idx);

        if (Character.isDigit(ch)) {

            path.append(ch);
            backtrack(s, idx + 1, path);
            path.deleteCharAt(path.length() - 1);

        } else {

            path.append(Character.toLowerCase(ch));
            backtrack(s, idx + 1, path);
            path.deleteCharAt(path.length() - 1);

            path.append(Character.toUpperCase(ch));
            backtrack(s, idx + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}