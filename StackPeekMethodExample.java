import java.util.Stack;

public class StackPekMethodExample {
    public static void main(String[]args){
        Stack<String> stk = new Stack<>();
        //push elemnt on the stack
       
        stk.push("apple");
        stk.push("banana");
        stk.push("Guava");
        stk.push("orange");
        System.out.println("stack"+stk);

        String fruits = stk.peek();
        System.out.println("Element at a top: "+fruits);
    }
}
