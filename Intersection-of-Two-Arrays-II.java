class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1= nums1.length,n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        List<Integer> hashu = new ArrayList<>();
        while(i<n1&&j<n2){
            if(nums1[i]==nums2[j]){
                hashu.add(nums2[j]);
                i++;j++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }


        int n = hashu.size();
        int[] arr= new int[n];
        for(int k=0;k<n;k++){
            arr[k] = hashu.get(k);
        }
        return arr;
    }
}