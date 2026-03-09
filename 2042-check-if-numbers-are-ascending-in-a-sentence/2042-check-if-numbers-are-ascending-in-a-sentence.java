class Solution {
    public boolean areNumbersAscending(String s) {
        // s = s.trim();                 // remove leading/trailing spaces
        // String[] arr = s.split("\\s+");  // split by spaces
        String[] arr = s.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();

        for(String word : arr){
            if(word.matches("\\d+")){
                numbers.add(Integer.parseInt(word));
            }
        }
        int[] result = new int[numbers.size()];
        int j=0;
        for(int a : numbers){
            result[j++] = a;
        }

        for(int i=1;i<result.length;i++){
            if(result[i]<=result[i-1]) return false;
        }
        return true;


    }
}