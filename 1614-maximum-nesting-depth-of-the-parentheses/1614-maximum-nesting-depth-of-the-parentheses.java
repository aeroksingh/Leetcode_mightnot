class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int curr = 0;

        for(char ch: s.toCharArray()){
            if(ch == '(') curr++;
            else if(ch == ')') curr--;
            max = Math.max(curr,max);
        }
        return max;
    }
}