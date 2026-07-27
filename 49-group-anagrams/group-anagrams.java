class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String fs = new String(ch);
            if (hm.containsKey(fs)) {
                hm.get(fs).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                hm.put(fs, strList);
            }
        }
        return new ArrayList<>(hm.values());
    }
}