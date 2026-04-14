class Solution {
    public int arrangeCoins(int n) {
        
        int l=0;
        int r=n;
        while(l<=r){
            long mid=l +(r-l)/2;
            long coins=((mid)*(mid+1))/2;
            
            if(coins==n)return (int)mid;

            if(coins<n){
                l=(int)mid+1;
            }
            else{
                r=(int)mid-1;
            }
            
        }
        return (int) r;
    }
}