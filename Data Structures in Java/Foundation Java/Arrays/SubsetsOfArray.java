//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion#

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
    
    int limit = (int)Math.pow(2, arr.length);
    for(int i=0; i<limit; i++){
        String set = "";
        int temp = i;
        
        for(int j=arr.length-1; j>=0; j--){
            int r = temp % 2;
            temp = temp/2;
            
            if(r==0){
                set = "-\t" + set;
            }
            else{
                set = arr[j] + "\t" + set;
            }
        }
        System.out.println(set);
    }
    
 }

}