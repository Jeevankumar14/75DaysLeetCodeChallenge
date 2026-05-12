class Solution {
    public String decodeString(String s) {
        Stack<String>st=new Stack<>();
        

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch!=']'){
                st.push(ch+"");
            }
            else{
                String str="";

                while(!st.peek().equals("[")){
                    str=st.pop()+str;
                }
                st.pop();
                String num="";

                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){
                    num=st.pop()+num;

                }
                int val=1;
                if(!num.equals("")) {
                    val = Integer.parseInt(num);
                }
                String temp="";
                for(int j=0;j<val;j++){
                    temp=str+temp;
                }

                st.push(temp);

            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }

        return ans;

        // StringBuilder sb=new StringBuilder();

        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(Character.isDigit(ch)){
        //         st.push(""+ch);
        //     }
        //     if(ch=='['){
        //         while(ch==']'){
        //             String s =""+ch;
        //         }
        //         st.push(s);
        //         String last=st.pop();
        //         int num=String.valueOf(st.pop);
        //         sb.append(num*last);
        //     }

        // }


    }
}