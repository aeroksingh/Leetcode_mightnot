class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] word = new char[n];
        Arrays.fill(word, '$');

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                if (lcp[i][j] != 0) {
                    word[i] = word[j];
                    break;
                }
            }

            if (word[i] == '$') {
                boolean[] forbidden = new boolean[26];

                for (int j = 0; j < i; j++) {
                    if (lcp[i][j] == 0 && word[j] != '$') {
                        forbidden[word[j] - 'a'] = true;
                    }
                }

                for (int k = 0; k < 26; k++) {
                    if (!forbidden[k]) {
                        word[i] = (char)(k + 'a');
                        break;
                    }
                }

                if (word[i] == '$') {
                    return "";
                }
            }

        
            for(int j = 0; j < i; j++){
                if(lcp[i][j] > 0){
                    word[j] = word[i];
                }
            }
        }

        int[][] computed = checkLCP(word);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (computed[i][j] != lcp[i][j]) {
                    return "";
                }
            }
        }

        return new String(word);
    }

    private int[][] checkLCP(char[] word) {
        int n = word.length;
        int[][] lcp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (word[i] == word[j]) {
                    if (i == n - 1 || j == n - 1) {
                        lcp[i][j] = 1;
                    } else {
                        lcp[i][j] = 1 + lcp[i + 1][j + 1];
                    }
                } else {
                    lcp[i][j] = 0;
                }
            }
        }
        return lcp;
    }
}