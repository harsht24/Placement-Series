//https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSS(str,"");
    }

    public static void printSS(String ques, String ans) {
            
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        
        printSS(roq, ans+ch);
        printSS(roq, ans+"");
    }

}