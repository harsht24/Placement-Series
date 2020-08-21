//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/decimal-to-any-base-official/ojquestion#

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // n - decimal number
       // b - base in which n is will be converted.
       int result=0;
       int power = 1;
       
       while(n>0){
           int q = n%b;
           n = n/b;
           
           result += q * power;
           power *= 10;
       }
       return result;
   }
  }