// https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion#

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int temp=n;
        int digits=0;
        
        while(temp > 0){
            digits++;
            temp = temp/10;
        }
        
        k = k % digits;
        
        if(k<0){
            k = k + digits;
        }
        
        int div = 1;
        int multi = 1;
        
        for(int i=1; i<=digits; i++){
            if(i<=k){
                div *= 10;
            }
            else{
                multi *= 10;
            }
        }
        
        int q = n / div;
        int r = n % div;
        
        int res = r * multi + q;
        System.out.println(res);
    }
   }