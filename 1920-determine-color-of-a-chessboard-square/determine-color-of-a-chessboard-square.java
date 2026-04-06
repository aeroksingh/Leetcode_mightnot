class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = (int)(coordinates.charAt(0) -'a');
        int b = coordinates.charAt(1) - '1';

         return (a + b) % 2 == 1;
    }
}