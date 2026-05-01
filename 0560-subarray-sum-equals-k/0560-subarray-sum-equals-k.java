class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        
        int presum[]=new int[n];
        presum[0]=nums[0];

        for(int i=1;i<n;i++){
            presum[i]=presum[i-1]+nums[i];
        }
        HashMap<Integer,Integer>m=new HashMap<>();
        m.put(0,1);

        for(int i=0;i<n;i++){

              if(m.containsKey(presum[i]-k)){
                count+=m.get(presum[i]-k);
              }
            m.put(presum[i],m.getOrDefault(presum[i],0)+1);
        }

        return count;

    }
}