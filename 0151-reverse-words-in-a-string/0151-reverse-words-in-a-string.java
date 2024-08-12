class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String k="";
        for(int i=str.length-1;i>=0;i--){
            if(str[i].length()==0){
                continue;
            }
            else {
                if(k.length()==0){
                    k+=str[i];
                }
                else{
                k+=" "+str[i];}
            }
        }
        return k;
    }
}