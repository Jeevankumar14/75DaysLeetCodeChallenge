class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> res= new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;


       while(right<s.length()){
            char ch = s.charAt(right);
            if (res.containsKey(ch)) {
                left = Math.max(left, res.get(ch) + 1);
            }
            res.put(ch, right);
            maxlen = Math.max(maxlen, right-left+1);
            right++;
        }

        return maxlen;
    }
}
