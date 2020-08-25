// https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/diagonal-traversal-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();       
            }
        }
        
        for(int gap = 0; gap < arr.length; gap++){
            for(int i = 0, j = gap; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }

}