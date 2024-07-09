class Solution {
    public boolean isValid(String s) {
        if(check(s)){
            return true;
        }
        return false;
    }
    public boolean check(String k){
        Stack<Character> map=new Stack<>();
        for(char c:k.toCharArray()){
        switch(c){
            case '(':map.push(c);break;
            case '{':map.push(c);break;
            case '[':map.push(c);break;
            case ')':if(map.empty()||map.peek()!='(') return false; else map.pop(); break;
             case '}':if(map.empty()||map.peek()!='{') return false; else map.pop(); break;
              case ']':if(map.empty()||map.peek()!='[') return false; else map.pop(); break;
              default:;
            
        }
        }
        return map.isEmpty();
    }
}