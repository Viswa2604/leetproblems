class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> ans=new Stack<>();
        ans.push(-1);
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans.push(i);
            }
            else{
                ans.pop();
                if(ans.isEmpty()){
                    ans.push(i);
                }
                else{
                    
                    res=Math.max(res,i-ans.peek());
                }
            }
        }
        return res;
    }
}