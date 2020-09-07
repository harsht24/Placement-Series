// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/fibonacci-dp-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FiboMemoized(n, new int[n+1]));
        
     }
    public static int FiboMemoized(int n, int[] qb){
        if(n == 0 || n == 1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        
        int fbn1 = FiboMemoized(n-1, qb);
        int fbn2 = FiboMemoized(n-2, qb);
        int fibn = fbn1 + fbn2;
        
        qb[n] = fibn;
        return fibn;
    }
    
    }