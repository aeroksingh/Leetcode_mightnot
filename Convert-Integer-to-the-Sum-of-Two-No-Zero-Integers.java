class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        
        for (int i = 1; i < n; i++) {
            int j = n - i;  
            if (isNoZero(i) && isNoZero(j)) {
                arr[0] = i;
                arr[1] = j;
                break;    
            }
        }
        return arr;
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false;
            num /= 10;
        }
        return true;
    }
}
