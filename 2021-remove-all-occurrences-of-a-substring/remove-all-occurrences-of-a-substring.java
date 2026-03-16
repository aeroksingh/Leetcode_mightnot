class Solution {
    public String removeOccurrences(String s, String part) {
        String st = remove(s,part);
        return st;
        
    }
    private String remove(String s , String part){
        StringBuilder sb = new StringBuilder(s);

        int start = sb.indexOf(part);
        
        while(start != -1){
            sb.replace(start,start+part.length(),"");
            start = sb.indexOf(part);
        }
        return sb.toString();
    }
}