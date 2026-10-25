class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image){
            aero(arr);
        }
        return image;
    }
    private int[] aero(int[] arr){
        int n = arr.length;
        if(n==1){
            if(arr[0]==1){
                arr[0]=0;
            }else{
                arr[0]=1;
            }
            return arr;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                arr[i] = 0;
            }else arr[i] = 1;
        }
        
        for(int i=0;i<n/2;i++){

            int temp=arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return arr;
    }
}