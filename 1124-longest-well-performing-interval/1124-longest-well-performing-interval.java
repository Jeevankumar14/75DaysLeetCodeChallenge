class Solution {
    public int longestWPI(int[] hours) {
        int maxlength=0;
        int sum=0;
        int n=hours.length;

        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
           if(hours[i]>8){
             sum+=1;
           }
           else if(hours[i]<=8){
              sum-=1;
           }
           if(sum>0){
            maxlength=i+1;
           }
           else{
             if(map.containsKey(sum-1)){
                int len=i-map.get(sum-1);
                maxlength=Math.max(len,maxlength);
              }
           }
           if(!map.containsKey(sum)){
             map.put(sum,i);
           }
        }

        return maxlength;
    }
}