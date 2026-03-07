class Solution {
    public int minFlips(String s) {

        int n = s.length();

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for(int k = 0; k < 2 * n; k++){
            s1.append(k % 2 == 0 ? '0' : '1');
            s2.append(k % 2 == 0 ? '1' : '0');
        }

        s = s + s;

        int result = Integer.MAX_VALUE;
        int f1 = 0;
        int f2 = 0;

        int i = 0;
        int j = 0;

        while(j < 2 * n){

            if(s.charAt(j) != s1.charAt(j)){
                f1++;
            }

            if(s.charAt(j) != s2.charAt(j)){
                f2++;
            }

            if(j - i + 1 > n){

                if(s.charAt(i) != s1.charAt(i)){
                    f1--;
                }

                if(s.charAt(i) != s2.charAt(i)){
                    f2--;
                }

                i++;
            }

            if(j - i + 1 == n){
                result = Math.min(result, Math.min(f1, f2));
            }

            j++;
        }

        return result;
    }
}