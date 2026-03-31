class Solution {
    public String generateString(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        int N = n1 + n2 - 1;

        char[] word = new char[N];
        Arrays.fill(word, '$');

        boolean[] canchange = new boolean[N];
        Arrays.fill(canchange, false);

        
        for (int i = 0; i < n1; i++) {
            if (str1.charAt(i) == 'T') {
                int ai = i;
                for (int j = 0; j < n2; j++) {
                    if (word[ai] != '$' && word[ai] != str2.charAt(j)) {
                        return "";
                    }
                    word[ai] = str2.charAt(j);
                    ai++;
                }
            }
        }


        for (int i = 0; i < N; i++) {
            if (word[i] == '$') {
                word[i] = 'a';
                canchange[i] = true;
            }
        }


        for (int i = 0; i < n1; i++) {
            if (str1.charAt(i) == 'F') {
                if (isSame(new String(word), str2, i, n2)) {
                    boolean change = false;

                    for (int k = i + n2 - 1; k >= i; k--) {
                        if (canchange[k]) {
                            word[k] = 'b';
                            change = true;
                            break;
                        }
                    }

                    if (!change) return "";
                }
            }
        }

        return new String(word);
    }

    private boolean isSame(String word, String str, int i, int m) {
        for (int j = 0; j < m; j++) {
            if (word.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
        }
        return true;
    }
}