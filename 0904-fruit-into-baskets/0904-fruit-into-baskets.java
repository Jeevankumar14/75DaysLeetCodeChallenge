class Solution {
    public int totalFruit(int[] fruits) {
    
        
        // int n = fruits.length;
        // int max = 0;

        // for (int i = 0; i < n; i++) {
        //     HashMap<Integer, Integer> map = new HashMap<>();
        //     for (int j = i; j < n; j++) {
        //         map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
        //         if (map.size() > 2) break;
        //         max = Math.max(max, j - i + 1);
        //     }
        // }
        // return max;

        int l=0;
        int len=0;
        HashMap<Integer,Integer>hs=new HashMap<>();
        
        for(int r=0;r<fruits.length;r++){
            hs.put(fruits[r],hs.getOrDefault(fruits[r],0)+1);
            while (hs.size()>2){
                hs.put(fruits[l], hs.get(fruits[l])-1);
                if (hs.get(fruits[l])==0) {
                    hs.remove(fruits[l]);
                }
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
    }
}