class Solution {
    int count = 0;
    public int totalWaviness(int num1, int num2) {

        int start = num1;
        int end = num2;

        for(int i=start;i<=end;i++){
            check(i);
        }   
        return count;
    }
    private void check(int num){
        String str = String.valueOf(num);
        
        for(int i=1;i<str.length();i++){
            if((i+1)<str.length()){
                if(str.charAt(i-1) < str.charAt(i) && str.charAt(i+1) < str.charAt(i) ){
                    count++;
                }
                if(str.charAt(i-1) > str.charAt(i) && str.charAt(i+1) > str.charAt(i) ){
                    count++;
                }
                }
        }
    }
}