class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer>hs=new HashSet<>();
        return isHappyNo(n,hs);


    }
    public boolean isHappyNo(int n,HashSet<Integer>hs){

        int x=n;
        if(x==1)return true;
        if(hs.contains(n)){
            return false;
        }
        hs.add(n);
        int sum=0;

        while(x>0){
            sum+=(x%10)*(x%10);
            x=x/10;
        }
        return isHappyNo(sum,hs);

    }
}