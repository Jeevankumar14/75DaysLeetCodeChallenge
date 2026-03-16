class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String st:strs){
            int freq[]=new int[26];
            for(char c:st.toCharArray()){
                freq[c-'a']++;

            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
               sb.append('#');
               sb.append(freq[i]);
            }

            String k=sb.toString();
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(st);

        }
        List<List<String>> res = new ArrayList<>();

        for (List<String> val : map.values()) {
            res.add(val);
        }
        return res;
    }
}