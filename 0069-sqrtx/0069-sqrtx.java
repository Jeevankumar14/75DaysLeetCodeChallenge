class Solution {
    public int mySqrt(int x) {
        
        int l=0;
        int r=x;
        int ans=-1;
        while(l<=r){
            long mid=(l+r)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                r=(int)mid-1;
            }
            else{
                ans=(int)mid;
                l=(int)mid+1;
            }
        }
        return ans;
    }
}