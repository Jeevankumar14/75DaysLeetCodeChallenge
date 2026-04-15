class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int vis[]=new int[n];

        int cnt=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(isConnected,vis,i);
                cnt++;
            }
        }
        
        return cnt;
    }

    public void dfs(int arr[][],int vis[],int row){
        vis[row]=1;

        int n=arr.length;

        for(int j=0;j<n;j++){
                if(arr[row][j]==1 && vis[j]==0){
                    dfs(arr,vis,j);
                } 
        }

    }
}