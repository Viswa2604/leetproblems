class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int start=0;
        int end=0;
         HashMap<Character,Integer> set = new HashMap<>();
         for(end=0;end<s.length();end++){
            char ch=s.charAt(end);
            if(set.containsKey(ch)){
                start = Math.max(set.get(ch) + 1, start);
            }
            set.put(ch,end);
            if(max<(end-start+1)){
                max=(end-start+1);
            }
            
         }
         return max;

    }
}