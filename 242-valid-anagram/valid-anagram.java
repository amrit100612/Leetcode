class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int chct[] = new int[26];
        for (char c : s.toCharArray()) {
            chct[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (chct[c - 'a'] == 0) {
                return false;
            }
            chct[c - 'a']--;
        }
        return true;
    }
}