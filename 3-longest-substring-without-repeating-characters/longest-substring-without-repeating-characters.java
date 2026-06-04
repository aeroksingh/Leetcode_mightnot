class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int len =0;
        String str = "";
        for(char ch : s.toCharArray()){

            while(set.contains(ch)){
                char first = str.charAt(0);
                set.remove(first);
                str = str.substring(1);
            }
            str += ch;
            set.add(ch);
            len = Math.max(str.length(),len);
        }
        return len;
    }
}