class Solution {
    public int findPeakElement(int[] nums) {

        int l=0;
        int ri=nums.length-1;
    
        while(l<ri){
            int mid=l+(ri-l)/2;
            if(nums[mid]>nums[mid+1]){
                ri=mid;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
}