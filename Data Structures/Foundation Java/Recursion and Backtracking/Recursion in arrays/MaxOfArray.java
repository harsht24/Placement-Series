// https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/max-of-an-array-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx >= arr.length){
            return arr[arr.length-1];
        }
        
        int max = maxOfArray(arr, idx+1);
        if(max < arr[idx]){
            max = arr[idx];
        }
        return max;
    }

}