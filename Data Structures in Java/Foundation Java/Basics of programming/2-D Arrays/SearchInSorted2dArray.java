// https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/search-in-a-sorted-2d-array-official/ojquestion#

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
        int target = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(target == arr[i][j]){
                    flag = true;
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
        if(flag){
            return;
        }
        else{
            System.out.println("Not Found");
        }
        
    }

}