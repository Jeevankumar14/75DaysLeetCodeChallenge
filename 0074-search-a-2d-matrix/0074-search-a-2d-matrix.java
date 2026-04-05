class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;

        int l=0;
        int a=m-1;
        int row=-1;
        while(l<=a){
              int mid=l+(a-l)/2;
              if(matrix[mid][0]>target){
                a=mid-1;
              }
              else{
                row=mid;
                l=mid+1;
              }
        }

        if(row==-1)return false;


        int low=0;
        int b=n-1;
        while(low<=b){
            int mi=low+(b-low)/2;
            if(matrix[row][mi]==target){
                return true;
            }
            else if(matrix[row][mi]>target){
                b=mi-1;
            }
            else{
                low=mi+1;
            }
        }
        return false;
    }
}