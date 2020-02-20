class Solution {
    /*
     * time: o(n)
     * space: o(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.length() == 0) return true;
        for (int i=0;i<s.length();i++) {
            Character ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.size() == 0) return false;
                char top = stack.peek();
                if (ch == ')' && top =='(') {
                    stack.pop();
                } else if (ch == '}' && top =='{') {
                    stack.pop();
                } else if (ch == ']' && top =='[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0;
        
    }
}