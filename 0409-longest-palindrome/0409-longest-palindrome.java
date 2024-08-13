class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> mp=new HashMap<>();
     int n=s.length();
     for(int i=0;i<n;i++){
        if(mp.containsKey(s.charAt(i))){
            mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            continue;
        }
        mp.put(s.charAt(i),1);
     }
     int ans=0;
     int k=0;
     for(int i:mp.values()){
        if(i%2==0){
            ans+=i;
        }
        else{
            ans+=(i-1);
            k=1;
        }
     }
     if(k==1){
        return ans+1;
     }
     return ans;
    }
}