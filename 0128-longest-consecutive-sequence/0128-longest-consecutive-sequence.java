class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=1;
        int max=1;
        int n=nums.length;
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]==nums[i]+1){
                cnt++;
            }
            else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                cnt=1;
            }
            max=Math.max(max,cnt);
            

        }
        return max;
    }
}