class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        gen(0, n, sb, ans, n, n);

        return ans;
    }

    private void gen(int i, int n, StringBuilder str,
                     List<String> ans, int ec, int sc) {

        // base case
        if (i == 2 * n) {
            ans.add(str.toString());
            return;
        }

        // take '('
        if (sc > 0) {
            str.append('(');
            gen(i + 1, n, str, ans, ec, sc - 1);
            str.deleteCharAt(str.length() - 1);
        }

        // take ')'
        if (ec > sc) {
            str.append(')');
            gen(i + 1, n, str, ans, ec - 1, sc);
            str.deleteCharAt(str.length() - 1);
        }
    }
}