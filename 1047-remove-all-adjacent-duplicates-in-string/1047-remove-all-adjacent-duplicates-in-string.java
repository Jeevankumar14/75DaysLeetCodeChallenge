class Solution {
    public String removeDuplicates(String s) {
       
          StringBuilder sb=new StringBuilder();

          return noDuplicates(0,sb,s);
          
    }

    public String noDuplicates(int i,StringBuilder sb,String s){
        if(i>s.length()-1){
            return sb.toString();
        }

        if(sb.length()>0 && sb.charAt(sb.length()-1)==s.charAt(i)){
            sb.deleteCharAt(sb.length()-1);
            
        }
        else{
            sb.append(s.charAt(i));

        }
        
        return noDuplicates(i+1,sb,s);

    }
}