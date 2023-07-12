class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(token.equals("+"))
                stack.add(stack.pop() + stack.pop());
            else if(token.equals("-")){
                 int second = stack.pop();
                stack.add(stack.pop() - second);
            }else if(token.equals("/")){
                int second = stack.pop();
                stack.add(stack.pop() / second);
            }else if(token.equals("*"))
                stack.add(stack.pop() * stack.pop());
            else
                stack.add(Integer.valueOf(token));
        }
        return stack.pop();
    }
}