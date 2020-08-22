//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i=0; i < size; i++){
        arr[i] = sc.nextInt();
    }
    int d = sc.nextInt();
    
    int result = -1;
    
    for(int i=0; i < size; i++){
        if(arr[i]==d){
            
            result = i;
            break;
        }
    }
        System.out.println(result);
 }

}