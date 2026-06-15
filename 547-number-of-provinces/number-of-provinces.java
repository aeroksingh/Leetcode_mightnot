class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count =0;
        int n = isConnected.length;
        boolean visited[] = new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
    public void dfs(int node,int[][] isConnected,boolean[] visited){

        visited[node] = true;
        for(int neighbour=0; neighbour<isConnected.length; neighbour++){

            if(!visited[neighbour] &&  isConnected[node][neighbour] == 1)
            {
                dfs(neighbour,isConnected,visited);
            }
        }
    }
}