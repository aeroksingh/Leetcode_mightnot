class Solution {
    int idx;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }

        int[] state = new int[numCourses];
        int[] ans = new int[numCourses];
        idx = numCourses - 1;

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (dfs(i, graph, state, ans)) {
                    return new int[0];
                }
            }
        }

        return ans;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> graph,
                        int[] state, int[] ans) {

        state[node] = 1; 

        for (int neighbor : graph.get(node)) {

            if (state[neighbor] == 1) {
                return true; 
            }

            if (state[neighbor] == 0) {
                if (dfs(neighbor, graph, state, ans)) {
                    return true;
                }
            }
        }

        state[node] = 2;
        ans[idx--] = node; 

        return false;
    }
}