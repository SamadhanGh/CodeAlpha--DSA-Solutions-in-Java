package stack_Class;

import java.util.Stack;

class   Solution {
    public boolean isValid(String s) {
        // Create a stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // take current character

            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // If it's a closing bracket, we need to check conditions

                // Case 1: If stack is empty, no matching opening bracket exists
                if (stack.isEmpty()) {
                    return false;
                }

                // Look at the top element of the stack
                char top = stack.peek();

                // Case 2: Check if the top opening bracket matches the closing one
                if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {

                    // If yes, pop it out (we found a valid pair)
                    stack.pop();
                } else {
                    // Case 3: Mismatched pair -> invalid string
                    return false;
                }
            }
        }

        // After processing all characters:
        // If the stack is empty, all brackets were matched properly
        // If not, some opening brackets didn’t find their closing partner
        return stack.isEmpty();
    }

    // Main method to test in IntelliJ or any Java IDE
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.isValid("()"));      // true -> single valid pair
        System.out.println(sol.isValid("()[]{}"));  // true -> multiple valid pairs
        System.out.println(sol.isValid("(]"));      // false -> mismatched pair
        System.out.println(sol.isValid("([)]"));    // false -> wrong nesting
        System.out.println(sol.isValid("{[]}"));    // true -> properly nested
    }
}
