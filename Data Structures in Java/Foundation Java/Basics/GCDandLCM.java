import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      
      int original1 = num1;
      int original2 = num2;
      
      while(num1%num2 != 0){
          int remainder = num1 % num2;
          num1 = num2;
          num2 = remainder;
          
      }
      int gcd = num2;
      
      int lcm = (original1 * original2) / gcd; 
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }
    