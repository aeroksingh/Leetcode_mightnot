class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[arr1.length];
        for (int x : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == x) {
                    list.add(x);
                    used[i] = true;
                }
            }
        }
        ArrayList<Integer> rem = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!used[i]) {
                rem.add(arr1[i]);
            }
        }

        Collections.sort(rem);

        list.addAll(rem);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }

        return arr1;
    }
}