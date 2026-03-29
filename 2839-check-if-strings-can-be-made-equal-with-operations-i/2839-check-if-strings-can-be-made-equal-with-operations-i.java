class Solution {
    public boolean canBeEqual(String s1, String s2) {

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (!((arr1[0] == arr2[0] && arr1[2] == arr2[2]) ||
              (arr1[0] == arr2[2] && arr1[2] == arr2[0]))) {
            return false;
        }

        if (!((arr1[1] == arr2[1] && arr1[3] == arr2[3]) ||
              (arr1[1] == arr2[3] && arr1[3] == arr2[1]))) {
            return false;
        }

        return true;
    }
}