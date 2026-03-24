class Solution {
    public int maxArea(int[] height) {

    int l=0;
    int leftmax=0;
    int r=height.length-1;
    int rightmax=height.length-1;
    int area=0;
    int maxarea=0;

    while(l<r){
        if(height[leftmax]<height[rightmax]){
            if(height[l]>height[leftmax]){
                leftmax=l;
            }
            else{
                area=(rightmax-leftmax)*Math.min(height[leftmax],height[rightmax]);
                maxarea=Math.max(area,maxarea);
                l++;
            }
        }
        else{
            if(height[r]>height[rightmax]){
                rightmax=r;
            }
            else{
                area=(rightmax-leftmax)*Math.min(height[leftmax],height[rightmax]);
                maxarea=Math.max(area,maxarea);
                r--;

            }
        }
    }

    return maxarea;

  

    }
}