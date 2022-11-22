/*
 * Time = O(n)
 * Space = O(n);
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push('s');
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' ||curr == '{') {
                stack.push(curr);
            }
            else if(curr == ')' || curr == ']' ||curr == '}') {
                if(stack.peek() == '(' && curr == ')') {
                    stack.pop();
                }
                else if(stack.peek() == '[' && curr == ']') {
                    stack.pop();
                }
                else if(stack.peek() == '{' && curr == '}') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        stack.pop();
        if(stack.empty()) {
            return true;
        }
        return false;
    }
}