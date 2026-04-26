class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String start=strs[0];
        int len=start.length();

        for(int i=len;i>=0;i--){
            String s=start.substring(0,i);
            boolean ans=true;

            for(int j=1;j<n;j++){
                if(!strs[j].startsWith(s)){
                    ans=false;
                    break;
                }
            }
            if(ans){
                return s;
            }
        }

        return "";
    }
       
}