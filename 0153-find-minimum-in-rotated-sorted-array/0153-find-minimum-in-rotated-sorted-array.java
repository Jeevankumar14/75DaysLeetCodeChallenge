class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int res=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            if(res>nums[mid]){
                res=nums[mid];
            }

        }
        return res;
        
    }

}