class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String s=tokens[i];
                if(s.equals("+")){
                        int sec=st.pop();
                        int first=st.pop();
                        int res=first+sec;
                        st.push(res);
                }
                else if(s.equals("-")){
                        int sec=st.pop();
                        int first=st.pop();
                        int res2=first-sec;
                        st.push(res2);
                }
                else if(s.equals("*")){
                        int sec=st.pop();
                        int first=st.pop();
                        int res3=first*sec;
                        st.push(res3);
                }
                else if(s.equals("/")){
                        int sec=st.pop();
                        int first=st.pop();
                        int res4=first/sec;
                        st.push(res4);
                }
                else{
                    st.push(Integer.parseInt(s));
                }
        }

       return st.peek();
    }
}