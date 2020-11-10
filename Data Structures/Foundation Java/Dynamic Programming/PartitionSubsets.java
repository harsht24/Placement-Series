// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/partition-into-subsets-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
   
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       int k = sc.nextInt();
       
       if(n==0 || k==0 || n<k){
           System.out.println(0);
           return;
       }
       
       long[][] dp = new long[k+1][n+1];
       
       for(int teams=1; teams<=k; teams++){
           for(int people=1; people<=n; people++){
               if(people < teams){
                  dp[teams][people] = 0;
               }
               else if(people == teams){
                   dp[teams][people] = 1;
               }
               else{
                   dp[teams][people] = dp[teams-1][people-1] + dp[teams][people-1] * teams;
               }
               
           }
       }
       
        System.out.println(dp[k][n]);       
   } 
}