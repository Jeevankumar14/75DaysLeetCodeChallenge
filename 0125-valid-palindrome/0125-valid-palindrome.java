class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder ();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }
                else{
                    sb.append(ch);
                }

            }
            else{
                continue;
            }
            
        }
        String a=sb.toString();
        String reverse=(sb.reverse()).toString();
        if(a.equals(reverse)){
            return true;

        }
        return false;


    }
}