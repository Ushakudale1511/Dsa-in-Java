import java.util.Stack;
public class StackEmptyMethodExample {
    public static void main(String []args){
        // create an object on the stack
Stack<Integer>stk=new Stack<>();
//checking stack is empty or not
boolean result = stk.empty();
System.out.println("is the stack is empty?"+ result);
//pushing elements into stack
stk.push(31);
stk.push(45);
stk.push(89);
stk.push(67);
//prints elements on the stack
System.out.println("Elements in stack:"+stk);
result=stk.empty();
System.out.println("is the stack is empty"+result);

    }
}
