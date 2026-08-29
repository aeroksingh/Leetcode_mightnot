class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String result="";
        if(strs.length==0) return "";
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) !=c){
                    return result;
                }
            }result +=c;
            }
            
    
        return result;
    }
}