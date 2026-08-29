class Solution {
    public boolean hasSameDigits(String s) {
        char[] current = s.toCharArray();
        
        while (current.length > 2) {
            int n = current.length - 1;
            char[] next = new char[n];

            for (int i = 0; i < n; i++) {
                int digit1 = current[i] - '0';
                int digit2 = current[i + 1] - '0';
                next[i] = (char) ('0' + (digit1 + digit2) % 10);
            }
            
            current = next;
        }
        
        return current[0] == current[1];
    }
}
