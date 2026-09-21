class Solution {
    public int reverseDegree(String s) {
        int total =0;
        int count = 1;
        for(char ch: s.toCharArray()){
            total += (26 - (ch-'a'))*count;
            count++;
        }
        return total;
    }
}