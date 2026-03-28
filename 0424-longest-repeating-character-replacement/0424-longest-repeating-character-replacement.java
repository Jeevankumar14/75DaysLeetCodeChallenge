class Solution {
    public int characterReplacement(String s, int k) {
        
        int l=0;
        int arr[]=new int[26];
        int maxfreq=0;
        int maxlen=0;

        for(int r=0;r<s.length();r++){
           arr[s.charAt(r)-'A']++;
           maxfreq=Math.max(maxfreq,arr[s.charAt(r)-'A']);

           while(r-l+1-maxfreq>k){
              arr[s.charAt(l)-'A']--;
              l++;
           }

           maxlen=Math.max(r-l+1,maxlen);
        }

        return maxlen;

           
    }
}