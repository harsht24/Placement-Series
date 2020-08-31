// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, target);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
            if(sos > tar){
                return;
            }
            
            if(idx==arr.length){
                if(sos==tar){
                    System.out.println(set+".");
                }
                return;
            }
        
            printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ", arr[idx]+sos, tar);    
            printTargetSumSubsets(arr, idx+1, set, sos, tar);
        
        
    }

}