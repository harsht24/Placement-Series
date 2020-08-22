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
    
    int smallest = arr[0];
    int largest = arr[0];
    
    for(int i = 1; i < size; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
        else if(arr[i] < smallest){
            smallest = arr[i];
        }
    }
    System.out.println(largest-smallest);
 }

}