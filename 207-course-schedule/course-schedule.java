class Solution {
    public boolean canFinish(int num,int[][] pre)
    {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<num;i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int[] edge: pre)
        {
            int v = edge[0];
            int u = edge[1];

            graph.get(u).add(v);
        }

        int[] state = new int[num];

        for(int i=0;i<num;i++){

            if(dfs(i,state,graph))
            {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int node,int[] state,ArrayList<ArrayList<Integer>> graph)
    {
        state[node] = 1;
        for (int neighbor : graph.get(node)) {

            if (state[neighbor] == 1) {
                return true;
            }

            if (state[neighbor] == 0) {
                if (dfs(neighbor,state,graph)) {
                    return true;
                }
            }
        }
        state[node] = 2;
        return false;
    }
    
}