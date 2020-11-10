// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/prefix-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack <Integer> valueStack = new Stack<>();
        Stack <String> prefix = new Stack<>();
        Stack <String> postfix = new Stack<>();
        
        for(int i=exp.length()-1; i>=0; i--){
            char ch = exp.charAt(i);
            
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2 = valueStack.pop();
                int v1 = valueStack.pop();
                int val = operation(v1, v2, ch);
                valueStack.push(val);
                
                String postfixv2 = postfix.pop();
                String postfixv1 = postfix.pop();
                String postfixv = "(" + postfixv2 + ch + postfixv1 + ")";
                postfix.push(postfixv);
                
                String prefixv2 = prefix.pop();
                String prefixv1 = prefix.pop();
                String prefixv = prefixv2 + prefixv1 + ch;
                prefix.push(prefixv);
                
            }else{
                valueStack.push(ch - '0');
                postfix.push(ch + "");
                prefix.push(ch + "");
            }
        }
       System.out.println(valueStack.pop());
       System.out.println(postfix.pop());
       System.out.println(prefix.pop());
    }
    public static int operation(int b, int a, char op){
        if(op=='+'){
            return a+b;
        }
        else if(op=='-'){
            return a-b;
        }
        else if(op=='*'){
            return a*b;
        }
        else{
            return a/b;
        }
            
    }
}
