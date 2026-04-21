class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        
        Arrays.sort(nums);
        subsets(nums,0,res,li);
        return res;
        
    }

    public void subsets(int nums[],int ind,List<List<Integer>>res,List<Integer>li){
        if(ind==nums.length){
            res.add(new ArrayList<>(li));
            return;
        }
        li.add(nums[ind]);
        subsets(nums,ind+1,res,li);

        li.remove(li.size()-1);

        int nextind=ind;
        while (nextind+1<nums.length && nums[nextind] == nums[nextind + 1]) {
            nextind++;
        }

        subsets(nums,nextind+1,res,li);
    }
}