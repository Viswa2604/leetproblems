class Solution {
    public boolean validPalindrome(String s) {
        return validPalindromeHelper(s, 0, s.length() - 1, 1);
    }

    private boolean validPalindromeHelper(String s, int left, int right, int deletions) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (deletions == 0) {
                    return false;
                }
                // Try deleting either left or right character
                return validPalindromeHelper(s, left + 1, right, deletions - 1) ||
                       validPalindromeHelper(s, left, right - 1, deletions - 1);
            }
            left++;
            right--;
        }
        return true;
    }
}
