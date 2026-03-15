class Solution {
    public int maxVowels(String s, int k) {

    int len=s.length();
    int cnt=0;
    int maxcnt=0;
    for(int i=0;i<k;i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              cnt++;
        }
    }
    maxcnt=Math.max(cnt,maxcnt);

    for(int i=k;i<len;i++){
        char ch=s.charAt(i);
        if("aeiou".indexOf(ch) != -1){
            cnt++;
        }
        char c=s.charAt(i-k);
        if("aeiou".indexOf(c) != -1){
            cnt--;
        }

        maxcnt=Math.max(cnt,maxcnt);

    }   

    return maxcnt;
     
    }
}