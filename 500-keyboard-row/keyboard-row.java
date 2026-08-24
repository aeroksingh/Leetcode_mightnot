class Solution {
    public String[] findWords(String[] words) {

        List<String> rows = new ArrayList<>();
        rows.add("qwertyuiop");
        rows.add("asdfghjkl");
        rows.add("zxcvbnm");

        List<String> ans = new ArrayList<>();

        for (String str : words) {

            String temp = str.toLowerCase();

            int k = 0;

            // Find the row of the first character
            for (int i = 0; i < 3; i++) {
                if (rows.get(i).contains(String.valueOf(temp.charAt(0)))) {
                    k = i;
                    break;
                }
            }

            boolean found = true;

            // Check all characters belong to same row
            for (char ch : temp.toCharArray()) {
                if (!rows.get(k).contains(String.valueOf(ch))) {
                    found = false;
                    break;
                }
            }

            if (found) {
                ans.add(str);
            }
        }

        return ans.toArray(new String[0]);
    }
}