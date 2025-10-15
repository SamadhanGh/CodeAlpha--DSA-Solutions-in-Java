package stack_Class;

import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack; // each element = {price, span}

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // every price has at least span = 1
        // Pop all smaller or equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        // Push current price with its span
        stack.push(new int[]{price, span});
        return span;
    }

    // Main method for testing
    public static void main(String[] args) {
        StockSpanner obj = new StockSpanner();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("Prices: ");
        for (int price : prices) {
            int span = obj.next(price);
            System.out.println("Price: " + price + " -> Span: " + span);
        }
    }
}
