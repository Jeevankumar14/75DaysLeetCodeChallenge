class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        boolean vis[][]=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    return dfs(i,j,grid,vis);
                }
            }
        }
        return 0;

        
    }

    public int dfs(int row,int col,int grid[][],boolean vis[][]){

        int m = grid.length;
        int n = grid[0].length;

        if(row<0 || col<0 || row>=m || col>=n){
            return 1;
        }

        if(grid[row][col]==0){
            return 1;
        }

        if(vis[row][col]){
            return 0;
        }

        vis[row][col]=true;

        int a[]={-1,0,1,0};
        int b[]={0,1,0,-1};
        int perimeter=0;

        for(int k=0;k<4;k++){
            int nrow=row+a[k];
            int ncol=col+b[k];

            perimeter+=dfs(nrow,ncol,grid,vis);

        }
        return perimeter;
    }
}