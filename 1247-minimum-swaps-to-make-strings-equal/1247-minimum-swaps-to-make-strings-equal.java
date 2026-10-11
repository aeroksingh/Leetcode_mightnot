class Solution { 
    public int minimumSwap(String s1, String s2) {
        int xy = 0;
        int yx = 0;

        int n = s1.length();
        for(int i=0;i<n;i++){

            if(s1.charAt(i) == 'x' && s2.charAt(i)=='y'){
                xy++;
            }
            else if(s1.charAt(i) == 'y' && s2.charAt(i) == 'x'){
                yx++;
            }
        }
        if((xy+yx)%2 == 0){
            return xy/2 + yx/2 + xy%2 + yx%2;
        }
        return -1;
    }
}