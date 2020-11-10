// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/balanced-brackets-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {
    public static boolean handleClosingBracket(Stack<Character> stack, char openingCh){
        if(stack.size()==0){
            return false; // closing brackets are more than opening brackets.
        }
        else if(stack.peek()!=openingCh){
            return false;
        }
        else{
            stack.pop();
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')'){
                boolean val = handleClosingBracket(stack, '(');    
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch=='}'){
                boolean val = handleClosingBracket(stack, '{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch==']'){
                boolean val = handleClosingBracket(stack, '[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if (stack.size()==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}