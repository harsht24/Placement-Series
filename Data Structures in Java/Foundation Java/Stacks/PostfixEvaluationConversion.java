// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/postfix-evaluation-conversions-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack <Integer> valueStack = new Stack<>();
        Stack <String> prefix = new Stack<>();
        Stack <String> infix = new Stack<>();
        
        for(int i=0; i<exp.length(); i++){
            char ch = exp.charAt(i);
            
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 = valueStack.pop();
                int v1 = valueStack.pop();
                int val = operation(v1, v2, ch);
                valueStack.push(val);
                
                String infixv2 = infix.pop();
                String infixv1 = infix.pop();
                String infixv = "(" + infixv1 + ch + infixv2 + ")";
                infix.push(infixv);
                
                String prefixv2 = prefix.pop();
                String prefixv1 = prefix.pop();
                String prefixv = ch + prefixv1 + prefixv2;
                prefix.push(prefixv);
                
            }else{
                valueStack.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
        }
       System.out.println(valueStack.pop());
       System.out.println(infix.pop());
       System.out.println(prefix.pop());
    }
    public static int operation(int v1, int v2, char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
            
    }
}
