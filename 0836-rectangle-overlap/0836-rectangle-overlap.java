class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];

        int x11 = rec2[0];
        int y11 = rec2[1];
        int x22 = rec2[2];
        int y22 = rec2[3];

        if (x2 <= x11 || x22 <= x1 ||
            y2 <= y11 || y22 <= y1) {
            return false;
        }

        return true;
    }
}