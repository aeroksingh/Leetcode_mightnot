class Solution {
    public String[] createGrid(int m, int n) {
        
        boolean[][] visit = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0) visit[i][j] = true;
                if(j==n-1) visit[i][j]=true;
            }
        }

        StringBuilder sb = new StringBuilder();
        String[] res = new String[m];
        int k=0;
        for(int i=0;i<m;i++){
            sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(visit[i][j]){
                    sb.append('.');
                }else{
                    sb.append('#');
                }
            }
            res[k++]=sb.toString();
        }
        return res;
    }
}