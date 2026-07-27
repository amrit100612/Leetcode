class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int chct[] = new int[26];
        for (char c : magazine.toCharArray()) {
            chct[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (chct[c - 'a'] == 0) {
                return false;
            }
            chct[c - 'a']--;
        }
        return true;
    }
}