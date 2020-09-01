//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/print-all-subarrays-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int input=0; input<n; input++){
         arr[input] = sc.nextInt();
    }
    
    int[] arr1 = new int[n];
    
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
        
            for(int k=i; k<=j; k++){
            
                System.out.print(arr[k]+"\t");                    
            }
            System.out.println();                    
        }
    }
    
    
 }

}