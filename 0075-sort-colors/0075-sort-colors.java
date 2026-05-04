class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length; 

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (nums[j] == 0 && nums[i] != 0) {
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                }
                else if (nums[j] == 1 && nums[i] == 2) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        
    }
    
}