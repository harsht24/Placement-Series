// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-binary-strings-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int oldCountZeros = 1;
        int oldCountOnes = 1;
        
        for(int i=2; i<=n; i++){
            int newCountZeros = oldCountOnes;
            int newCountOnes = oldCountOnes + oldCountZeros;
            
            oldCountZeros = newCountZeros;
            oldCountOnes = newCountOnes;
        }
        System.out.println(oldCountZeros + oldCountOnes);
 }

}