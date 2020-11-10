package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);

        var front = q.remove();
        System.out.println("Item removed from the queue is : "+front+"\n"+q);

        reverse(q);
        System.out.println("Reversed queue is : "+q);


                
        }
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty())
            stack.push(q.remove());

        while (!stack.isEmpty())
            q.add(stack.pop());
       }
    }

