package stack_Class;
import java.util.ArrayList;

public class stack_usingArraylist {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static int top = -1; // stack is empty

        // push
        public void push(int val) {
            list.add(val);
            top++;
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int removed = list.get(top);
            list.remove(top);
            top--;
            return removed;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(top);
        }

        // isEmpty
        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        Stack s= new Stack();

        s.push(2);
        s.push(4);
        System.out.println("Top element: " + s.peek());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());
        System.out.println("Is empty? " + s.isEmpty());
    }
}


