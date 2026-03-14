class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[r]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
            if(ans>nums[mid]){
                ans=nums[mid];
            }

        }
        return ans;
        
    }

}