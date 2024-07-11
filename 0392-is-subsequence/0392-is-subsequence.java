class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] u=s.toCharArray();
        char[] v=t.toCharArray();
        int column=0;
        for(int i=0;i<u.length;i++){
            int k=0;
            for(int j=column;j<v.length;j++){
                if(u[i]==v[j]){
                    k=1;
                    v[j]='1';
                    column=j+1;
                    break;

                }
            }
            if(k==0){
                return false;
            }
        }
        return true;

    }
}