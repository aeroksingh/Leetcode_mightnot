class Solution {
    public int scoreOfParentheses(String s) {

        int n = s.length();

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if(ch == '(') {

                st.push(0);

            } 
            else {

                int inside = st.pop();

                if(inside == 0) {
                    inside = 1;
                } 
                else {
                    inside = 2 * inside;
                }

                if(!st.isEmpty()) {
                    int previous = st.pop();
                    st.push(previous + inside);
                } 
                else {
                    st.push(inside);
                }
            }
        }

        return st.peek();
    }
}