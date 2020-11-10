//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first-index-last-index-official/ojquestion#

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
        int data = sc.nextInt();
        
        int low = 0;
        int high = arr.length-1;
        int first_index = -1;
     
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(data > arr[mid]){
                low = mid + 1;    
            }
            else if(data < arr[mid]){
                high = mid - 1;
            }
            else{
                first_index = mid;
                high = mid - 1;
            }
        }
        System.out.println(first_index);
        
        
        low = 0;
        high = arr.length-1;
        int last_index = -1;
     
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(data > arr[mid]){
                low = mid + 1;    
            }
            else if(data < arr[mid]){
                high = mid - 1;
            }
            else{
                last_index = mid;
                low = low + 1;
            }
        }
        System.out.println(last_index);
    }

}