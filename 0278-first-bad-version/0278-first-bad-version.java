/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l=0;
        int r=n;
        int a=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            boolean res=isBadVersion(mid);
            if(res ==false){
                l=mid+1;
            }
            else{
                a=mid;
                r=mid-1;
            }
        }

        return a;
    }
}