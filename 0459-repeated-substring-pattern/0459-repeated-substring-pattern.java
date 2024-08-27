class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        // Iterate over possible substring lengths from 1 to n/2
        for (int len = 1; len <= n / 2; len++) {
            // If n is divisible by len, check if repeating the substring forms the original string
            if (n % len == 0) {
                String pattern = s.substring(0, len);
                StringBuilder repeated = new StringBuilder();
                for (int i = 0; i < n / len; i++) {
                    repeated.append(pattern);
                }
                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
