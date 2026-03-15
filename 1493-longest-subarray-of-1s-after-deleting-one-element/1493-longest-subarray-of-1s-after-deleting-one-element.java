class Solution {
    public int longestSubarray(int[] nums) {
        int maxlen=0;
        int l=0;
        int cnt=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                cnt++;
            }
            while(cnt>=2){
                if(nums[l]==0){
                    cnt--;
                }
                l++;
            }
            maxlen=Math.max(r-l,maxlen);
        }

        return maxlen;
    }
}