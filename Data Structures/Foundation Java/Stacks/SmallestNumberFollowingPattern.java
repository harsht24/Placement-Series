// https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/smallest-number-following-pattern-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

        Stack<Integer> stack = new Stack<>();
        int count=1;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch=='d'){
                stack.push(count);
                count++;
            }
            else{
                stack.push(count);
                count++;
                while(stack.size() > 0){
                    int remove = stack.pop();
                    System.out.print(remove);
                }
                
            }
        }
            stack.push(count);
            while(stack.size() > 0){
                    int remove = stack.pop();
                    System.out.print(remove);
                }
 }
}