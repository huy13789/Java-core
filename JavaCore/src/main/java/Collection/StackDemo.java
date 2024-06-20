package Collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // LIFO: Last In - First Out
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        // [3]
        stack.push(5);
        // [3, 5]
        stack.push(7);
        // [3, 5, 7]
        System.out.println(stack);

        int peek = stack.peek();
        // 7
        System.out.println(peek);
        System.out.println(stack);

        int pop = stack.pop();
        // 7
        System.out.println(pop);
        System.out.println(stack);

    }
}
