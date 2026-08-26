class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
        "", "",
        "abc", "def", "ghi",
        "jkl", "mno", "pqrs",
        "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return ans;

        backtrack(digits, 0, new StringBuilder());

        return ans;
    }

    public void backtrack(String digits, int index, StringBuilder current) {

        // Base Case
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        // Current digit
        int digit = digits.charAt(index) - '0';

        // Letters for the current digit
        String letters = map[digit];

        // Try every letter
        for (int i = 0; i < letters.length(); i++) {

            // Choose
            current.append(letters.charAt(i));

            // Explore
            backtrack(digits, index + 1, current);

            // Undo
            current.deleteCharAt(current.length() - 1);
        }
    }
}