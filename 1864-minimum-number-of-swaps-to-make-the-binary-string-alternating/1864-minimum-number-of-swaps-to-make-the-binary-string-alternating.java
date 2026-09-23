class Solution {
    public int minSwaps(String s) {
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }
        int zeros = s.length()-ones;

        if(Math.abs(zeros-ones)>1) return -1;

        if(zeros>ones){
            return swaps(s,0);
        }
        else if (ones>zeros) return swaps(s,1);
        return Math.min(swaps(s, 0), swaps(s, 1));
    }
    private int swaps(String s,int start){
        int except=0;
        int match=0;
        for (int i=0;i<s.length();i++){
            except = (i+start) %2;
            if(s.charAt(i)-'0' != except){
                match++;
            }
        }
        return match/2;
    }
}