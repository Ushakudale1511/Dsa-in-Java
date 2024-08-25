import java.util.Stack;

class stack1 {
    public static void main(String[] args) {
        // Create an object of Stack class
        Stack<String> animals = new Stack<>();

        // Push elements to the top of the stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        animals.push("Ant");
        System.out.println("Stack: " + animals);

        // Pop an element from the top of the stack
        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}