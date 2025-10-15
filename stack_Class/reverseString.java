package stack_Class;

import java.util.Stack;

public class reverseString {

    public String reverseAString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        // Push all characters into the stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Pop characters from the stack and append
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }

        return str.toString();
    }

    public static void main(String[] args) {
        reverseString obj = new reverseString();
        String original = "Hello World!";
        String reversed = obj.reverseAString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
