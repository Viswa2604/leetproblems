class Solution {
    public boolean isPalindrome(String s) {
        String k=s.toLowerCase();
        String v="";
        for (char r : k.toCharArray()) {
        if (Character.isLetter(r)) {
            v+=r;
        }
        if (Character.isDigit(r)) {
            v+=r;
        }
        }
        
        for(int i=0;i<v.length()/2;i++){
            if(v.charAt(i)!=v.charAt(v.length()-1-i)){
                return false;
            }
            
            }
            return true;
        
    }
}