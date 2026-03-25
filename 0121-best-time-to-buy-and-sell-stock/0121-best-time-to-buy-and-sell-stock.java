class Solution {
    public int maxProfit(int[] nums) {
        int ans=0;
        int maxans=0;
        int n=nums.length;

        int l=0;
        int r=1;

        while(r<nums.length){
            if(nums[r]>nums[l]){
                ans=nums[r]-nums[l];
                maxans=Math.max(ans,maxans);
            }
            else{
                l=r;
            }
            r++;

        }

        return maxans;
        
    }
}