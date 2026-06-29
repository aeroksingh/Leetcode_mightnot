class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        for(String str: patterns)
        {
            if(sb.indexOf(str) != -1)
            {
                count++;
            }
        }
        return count;
    }
}