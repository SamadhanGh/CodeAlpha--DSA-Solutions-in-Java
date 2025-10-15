package stack_Class;

import java.util.*;

public class stack_usingCollection {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>(); // ✅ capital S

        // Push elements
        s.push(1);
        s.push(2);
        s.push(3);

        // Print and pop elements
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // peek top
            s.pop(); // remove top
        }
    }
}
