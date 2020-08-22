//https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion

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
    
    int max = arr[0];
    for(int i=1; i < size; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    
    for(int floor=max; floor >= 1; floor--){
        for(int j=0; j < size; j++){
            if(arr[j] >= floor){
                System.out.print("*\t");    
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}