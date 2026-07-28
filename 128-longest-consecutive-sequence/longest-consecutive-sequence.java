class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, Boolean.FALSE);
        }
        for (int x : nums) {
            int curr = 1;
            int nextnum = x + 1;
            while (hm.containsKey(nextnum) && hm.get(nextnum) == false) {
                curr++;
                hm.put(nextnum, Boolean.TRUE);
                nextnum++;
            }
            int prev = x - 1;
            while (hm.containsKey(prev) && !hm.get(prev)) {
                curr++;
                hm.put(prev, Boolean.TRUE);
                prev--;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}