package stack;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

            Stack<Integer> stack = new Stack<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            System.out.println(stack);

            var top = stack.pop();
            System.out.println(top);
            System.out.println(stack);

            System.out.println(stack.peek());

            System.out.println("Is our Stack empty : "+stack.isEmpty());

            System.out.println("Position of 20 in stack is : "+stack.search(20));
        }
    }


