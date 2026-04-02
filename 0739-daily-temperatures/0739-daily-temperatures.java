
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();  
        st.push(0);
        
        for (int i=1;i<n;i++){
            while (!st.isEmpty() && temperatures[i] >temperatures[st.peek()]) {
                int Ind = st.pop();
                res[Ind] = i - Ind;  
            }
            st.push(i);
        }
        return res;
    }
}