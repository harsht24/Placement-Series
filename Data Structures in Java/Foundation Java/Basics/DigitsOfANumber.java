import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int temp = n;
      int digits = 0;
     
      while(temp!=0){
          digits++;
          temp = temp/10;
      }
      int div = (int)Math.pow(10, digits-1);
        
       while(div!=0){
        int q = n / div;
        System.out.println(q);
        n = n % div;
        div = div / 10;
      } 
     }
    }