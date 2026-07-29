class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int maxarea = 0;
        int n = height.length;

        int left  = 0;
        int right = n-1;
        int hei = 0;
        int length = 0;
        while(left<right)
        {
            
            hei = Math.min(height[left],height[right]);
            length = Math.abs(left-right);
            area = hei*length;
            maxarea = Math.max(area,maxarea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
           

        }
        return maxarea;

    }
}