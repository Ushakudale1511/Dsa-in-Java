import java.util.Stack;

public class StackPushPopExample {
    public static void main(String[] args) {
        // Create a stack object
        Stack<Integer> stk = new Stack<>();
        System.out.println("Stack is: " + stk);

        // Pushing elements onto the stack
        stk.push(32);
        stk.push(23);
        stk.push(90);
        stk.push(82);
        stk.push(29);
        stk.push(30);
        System.out.println("Elements in the stack are: " + stk);

        // Popping elements from the stack
        stk.pop();
        stk.pop();
        System.out.println("Elements in the stack after popping: " + stk);

        // Exception handling on stack underflow
        try {
            while (!stk.isEmpty()) {
                stk.pop();
            }
            // Attempting to pop from an empty stack
            stk.pop();
        } catch (Exception e) {
            System.out.println("Empty stack, no more elements to pop.");
        }
    }
}
