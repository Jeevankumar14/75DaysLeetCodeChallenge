class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<len;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return 0;
    }
}