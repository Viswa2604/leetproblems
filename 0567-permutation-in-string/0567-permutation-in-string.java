class Solution {
    int[] arr=new int[26];
    int[] arr1=new int[26];
    public boolean check(){
        for(int i=0;i<26;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
          int n=s1.length();
          int n1=s2.length();
        if(n>n1){
            return false;
        }
        for(int i=0;i<n;i++){
        arr[s1.charAt(i)-'a']++;
        arr1[s2.charAt(i)-'a']++;
        }
        if(check()){
            return true;
        }
        for(int i=n;i<n1;i++){
            arr1[s2.charAt(i)-'a']++;
            arr1[s2.charAt(i-n)-'a']--;
            if(check()){
                return true;
            }
        }
        return false;
      
      
    }
}