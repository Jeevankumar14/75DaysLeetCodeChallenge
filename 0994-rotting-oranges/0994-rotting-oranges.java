
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

    
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;

        int minutes = 0;

        int[] a = {-1, 0, 1, 0};
        int[] b = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int size = q.size();
            boolean spread = false;

            for(int i = 0; i < size; i++){
                int[] curr = q.poll();
                int x = curr[0], y = curr[1];

                for(int d = 0; d < 4; d++){
                    int nx = x + a[d];
                    int ny = y + b[d];

                    if(nx >= 0 && ny >= 0 && nx < rows && ny < cols && grid[nx][ny] == 1){
                        grid[nx][ny] = 2;
                        q.offer(new int[]{nx, ny});
                        fresh--;
                        spread = true;
                    }
                }
            }

            if(spread) minutes++;
        }

        if(fresh==0){
             return minutes;

        }
        return -1;
    }
}