class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len=s2.length();
        HashMap<Character,Integer>m1=new HashMap<>();
        HashMap<Character,Integer>m2=new HashMap<>();
        if(s1.length()>len){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        int k=s1.length();
        for(int i=0;i<k;i++){
            char c=s2.charAt(i);
            m2.put(c,m2.getOrDefault(c,0)+1);

            if(m1.equals(m2)){
                return true;
            }
        }
        for(int i=k;i<len;i++){
            char add=s2.charAt(i);
            char rem=s2.charAt(i-k);
            m2.put(add,m2.getOrDefault(add,0)+1);

            if(m2.get(rem)==1){
                m2.remove(rem);
            }
            else{
                m2.put(rem,m2.get(rem)-1);
            }
            if(m1.equals(m2)){
                return true;
            }
        }
        return false;
    }
}
