package stack_Class;

import java.util.Stack;

// push at the bottom of the stack - amazon Q
public class pushAtBottom {

    public static void pushAtBottomOfStack(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);   // base case: if stack is empty, put the new element
            return;
        }

        int top = s.pop(); // remove top plate
        pushAtBottomOfStack(s, data); // recursive call
        s.push(top); // put back the plate
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottomOfStack(s,4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
