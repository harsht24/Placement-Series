// https://www.pepcoding.com/resources/online-java-foundation/time-and-space-complexity/count-sort-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //write your code here
   int range = max - min + 1;
   int[] frequencyArr = new int[range];
   
   for(int i = 0; i < arr.length; i++){
       int idx = arr[i] - min;
       frequencyArr[idx]++;
   }
   
    for(int i = 1; i < frequencyArr.length; i++){
       frequencyArr[i] = frequencyArr[i] + frequencyArr[i-1];
   }
   
   int[] answer = new int[arr.length];
   for(int i = arr.length - 1; i >= 0; i--){
       int val = arr[i];
       int pos = frequencyArr[val - min];
       int idx = pos - 1;
       answer[idx] = val;
       frequencyArr[val - min]--; 
   }
   for(int i = 0; i < answer.length; i++){
       arr[i] = answer[i];
   }
    
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}