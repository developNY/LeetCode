class Solution {
    public boolean isValid(String s) {
        char c = s.charAt(0);
        if(s.length()%2 != 0 || c == ')' || c == ']' || c == '}')
            return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c2 = s.charAt(i);
            if(c2==')' || c2=='}' || c2==']'){
                if(stack.isEmpty())
                    return false;
                char pop = stack.pop();
                if(c2==')' && pop != '(')
                    return false;
                else if(c2==']' && pop != '[')
                    return false;
                else if(c2=='}' && pop != '{')
                    return false;
            }else
                stack.add(c2);
        }
        
        if(stack.isEmpty())
            return true;
        return false;
    }
}