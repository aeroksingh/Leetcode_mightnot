class Solution {
    public int generateKey(int num1, int num2, int num3) {

        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);

        s1 = pad(s1);
        s2 = pad(s2);
        s3 = pad(s3);

        String ans = "";

        ans += (char) Math.min(s1.charAt(0), Math.min(s2.charAt(0), s3.charAt(0)));
        ans += (char) Math.min(s1.charAt(1), Math.min(s2.charAt(1), s3.charAt(1)));
        ans += (char) Math.min(s1.charAt(2), Math.min(s2.charAt(2), s3.charAt(2)));
        ans += (char) Math.min(s1.charAt(3), Math.min(s2.charAt(3), s3.charAt(3)));

        return Integer.parseInt(ans);

    }

    private String pad(String s) {
        int n = 4 - s.length();

        for (int i = 0; i < n; i++)
            s = "0" + s;

        return s;
    }
}