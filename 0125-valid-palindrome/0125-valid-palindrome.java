class Solution {
    public boolean isPalindrome(String s) {
       
        StringBuilder sanitized = new StringBuilder();

        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sanitized.append(Character.toLowerCase(c));
            }
        }

        
        String v = sanitized.toString();
        int n = v.length();

        
        for (int i = 0; i < n / 2; i++) {
            if (v.charAt(i) != v.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
