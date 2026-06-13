class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        int sum = 0;
        int index = 0;

        for(int i = 0; i < words.length; i++) {
            String str = words[i];
            sum = 0;

            for(int j = 0; j < str.length(); j++) {
                index = str.charAt(j) - 'a';
                sum += weights[index];
            }

            sum = sum % 26;

            char ch = (char)('z' - sum);

            ans = ans + ch;
        }

        return ans;
    }
}