class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k<=1){
            return 0;
        }
        int cnt=0;
        int l=0;
        int pr=1;
        for(int r=0;r<nums.length;r++){
            pr*=nums[r];
            while(pr>=k){
                pr=pr/nums[l];
                l++;
            }
            cnt+=r-l+1;
        }
        return cnt;

    }
}