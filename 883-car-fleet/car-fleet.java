class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int[][] grp = new int[speed.length][2];

        for(int i=0;i<speed.length;i++){
            grp[i][0] = position[i];
            grp[i][1] = speed[i];
        }

        Arrays.sort(grp, (a,b) -> b[0] - a[0]);


        int count = 0;
        double maxT = 0;

        for(int i=0;i<speed.length;i++){
            double time = (double)(target-grp[i][0]) / grp[i][1];

            if(time>maxT){
                count++;
                maxT = time;
            }
        }
        return count;
    }
}
