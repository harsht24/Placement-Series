// https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-encodings-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncodings(str, "");
    }

    public static void printEncodings(String que, String answerSoFar) {
        if(que.length()==0){
            System.out.println(answerSoFar);
        }
        else if(que.length()==1){
            char ch = que.charAt(0);
            if(ch=='0'){
                return;
            }
            else{
                int charValue = ch - '0';
                char code = (char)('a' + charValue - 1);
                System.out.println(answerSoFar + code);
            }
        }
        else{
            char ch = que.charAt(0);
            String roq = que.substring(1);
            if(ch=='0'){
                return;
            }
            else{
                int charValue = ch - '0';
                char code = (char)('a' + charValue - 1);
                printEncodings(roq, answerSoFar + code);
            }
            String ch12 = que.substring(0, 2);
            String roq12 = que.substring(2);
            
            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)('a' + ch12v - 1);
                printEncodings(roq12, answerSoFar + code);
            }
            
        }
    }

}