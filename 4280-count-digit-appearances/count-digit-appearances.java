class Solution {
    int count=0;
    public int countDigitOccurrences(int[] nums, int digit) {
        for(int n : nums){
            counte(n,digit);
            
        }
        return count;
    }
    public void counte(int num,int digit){

        int n = num;
        while(n!=0){
            int a = n % 10;
            if(a == digit)
            {
                count++;
            }
            n=n/10;
        }
    }
}