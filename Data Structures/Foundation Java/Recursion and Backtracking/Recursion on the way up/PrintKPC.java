// https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-kpc-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }

    static String[] code = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String ques, String ans) {
        
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        
        String codeforch = code[ch-'0']; // without subtracting with zero code[ch] is same as code['6'] not code[6].
        for(int i=0; i<codeforch.length(); i++){
            char cho = codeforch.charAt(i);
            printKPC(roq, ans + cho);
        }
        
    }

}