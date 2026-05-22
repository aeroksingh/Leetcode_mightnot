class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        
        for(int num: arr1){
            String prefix = "";
            String s = String.valueOf(num);
            for(char ch: s.toCharArray()){
                prefix += ch;
                set.add(prefix);
            }
        }
        int ans =0;
        for(int num: arr2){
            String prefix = "";
            String s2 = String.valueOf(num);

            for(char ch: s2.toCharArray()){
                prefix += ch;
                if(set.contains(prefix)){
                    ans = Math.max(prefix.length(),ans);
                }
            }
        }
        return ans;

    }
}