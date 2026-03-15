class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!s.contains(i)) {
                li.add(i);
            }
        }
        
        return li;

    }
}