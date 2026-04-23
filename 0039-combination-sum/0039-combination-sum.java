class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        int n=candidates.length;
        int sum=0;
        List<Integer>li=new ArrayList<>();

        isSum(candidates,res,li,0,sum,target);
        return res;


        

    }
    public void isSum(int arr[],List<List<Integer>>res,List<Integer>li,int ind,int sum,int tar){

        if(sum==tar){
            res.add(new ArrayList<>(li));
            return;
        }
        if (ind >= arr.length || sum > tar) {
            return;
        }

        li.add(arr[ind]);
        isSum(arr,res,li,ind,sum+arr[ind],tar);

        li.remove(li.size()-1);
      
        isSum(arr,res,li,ind+1,sum,tar);
       

    }
}