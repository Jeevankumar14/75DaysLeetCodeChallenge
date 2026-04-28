class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0;
        // int maxcount=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
                
            }
            if(cnt> n/2){
                return nums[i];
            }
            cnt=0;
        }
        return -1;
 
    }
}