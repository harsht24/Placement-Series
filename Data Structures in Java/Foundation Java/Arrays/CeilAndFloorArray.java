//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    
    int floor = Integer.MIN_VALUE;
    int ceil = Integer.MAX_VALUE;
    
    for(int i=0; i<arr.length; i++){
        if(arr[i] > target){
            if(ceil >= arr[i]){
                ceil = arr[i];    
            }
            
        }
        if(arr[i] < target){
            if(floor <= arr[i]){
                floor = arr[i];    
            }
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }

}