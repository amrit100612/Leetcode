class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
            }

        String[] pad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            List<String> temp = new ArrayList<>();
            String letters = pad[digits.charAt(i) - '0'];

            for (int j = 0; j < result.size(); j++) {
                for (int k = 0; k < letters.length(); k++) {
                    temp.add(result.get(j) + letters.charAt(k));
                }
            }
            result = temp;
        }
        return result;
    }
}