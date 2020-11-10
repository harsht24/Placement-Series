// https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-permutations-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String ways) {
        
        if(ques.length()==0){
            System.out.println(ways);
            return;
        }
        
        
        for(int i=0; i<ques.length(); i++){
            
            char ch = ques.charAt(i);
            String leftPart = ques.substring(0,i);
            String rightPart = ques.substring(i+1);
        
            String roq = leftPart + rightPart;
            
            printPermutations(roq, ways + ch);
        
        }
        
        
        
    }

}