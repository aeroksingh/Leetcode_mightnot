class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int n = A.length;
        int[] arr = new int[n];

        int count =0;

        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<=i;j++){
                for(int k=0;k<=i;k++){
                    if(A[j] == B[k]) count++;
                }
            }
            arr[i] = count;
        }
        return arr;

    }
}