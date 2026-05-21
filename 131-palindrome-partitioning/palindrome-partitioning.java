class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        find(s, new ArrayList<String>());
        return res;
    }
    private void find(String s,ArrayList<String> curr){
        if(s.length() == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        int n = s.length();
        for(int i=0;i<n;i++){
            String part = s.substring(0,i+1);
            if(plain(part)){
                curr.add(part);
                find(s.substring(i+1),curr);
                curr.remove(curr.size()-1);
            
            }
            
        }
        

    }




    private boolean plain(String s){

        int n = s.length();

        for(int i=0;i<n;i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
}