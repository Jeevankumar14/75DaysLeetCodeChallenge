class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        if(m*k>bloomDay.length)return -1;
        int l=min;
        int r=max;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canMake(bloomDay,m,k,mid)){
                ans=mid;
                r=mid-1;

            }
            else{
                l=mid+1;
            }

        }
        return ans;

    }

    public boolean canMake(int[] bloomDay, int m, int k, int day){
        int count = 0;
        int bouquets = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0; 
                }
            } else {
                count = 0; 
            }
        }

        return bouquets >= m;
    }
}