class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> a=new Stack<>();
        // String v="";
        char[] h=s.toCharArray();


        for(int i=0;i<h.length;i++){
        if(!a.isEmpty()&&a.peek()==h[i]){
            a.pop();
        }
        else{
            a.push(h[i]);
        }
        }

        // while(!a.isEmpty()){
        //     v+=a.pop();
        // }
        String st="";
        for(char i: a){
            st=st+i;
        }

        return st; 
    }
}