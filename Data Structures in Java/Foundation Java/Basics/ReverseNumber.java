import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int digits = 0;
      int q = n;
      while(n>0){
          digits++;
          q = n%10;
          n = n/10;
          System.out.println(q);
      }
    }
   }