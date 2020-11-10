//https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/first-index-official/ojquestion#

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
        int target = sc.nextInt();
        System.out.println(firstIndex(arr, 0, target));
    }

    public static int firstIndex(int[] arr, int idx, int target){
        if(idx>=arr.length){
            return -1;
        }
        
        if(arr[idx]==target){
            return idx;
        }
        int first = firstIndex(arr, idx+1, target);
        
        return first;
    }

}