import java.util.Stack;
import java.util.Scanner;

public class stackinput {
    public static void main(String[] args) {
        // Create a Stack object
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter an animal :");
        String animal= sc.next();

        // Push the animal onto the stack
        stack.push(animal);
        stack.push(animal);
        stack.push(animal);
        stack.push(animal);

        System.out.println("Stack: " + stack);

        // Pop the animal from the stack
        String poppedAnimal = stack.pop();
        System.out.println("Stack after popping the element: " + stack);
        System.out.println("Popped Animal: " + poppedAnimal);

        sc.close(); // Close the scanner
    }
}
