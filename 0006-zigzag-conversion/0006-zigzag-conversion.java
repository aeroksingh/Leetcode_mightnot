class Solution {
    public String convert(String s, int numRows) {
        int n =  numRows;
        if(n == 1 || n >= s.length()) return s;

        StringBuilder sb = new StringBuilder();
        int cycle = 2*n-2;
        for(int row =0;row<n;row++)
        {
            for(int j=row;j<s.length();j+=cycle)
            {
                sb.append(s.charAt(j));
                int diagonal = j+cycle - 2*row;

                if(row!=0 && diagonal < s.length() && row != n-1)
                {
                    sb.append(s.charAt(diagonal));
                }
            }
        }
        return sb.toString();
    }
}