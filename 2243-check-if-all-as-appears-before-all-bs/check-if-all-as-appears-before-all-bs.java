class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int index = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'b'){
                index = i;
                break;
            }
        }
        if(index == -1) return true;
        boolean a = check(s,index);
        return a;

    }
    private boolean check(String s,int index){

        for(int i=index;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                return false;
            }
        }
        return true;
    }
}