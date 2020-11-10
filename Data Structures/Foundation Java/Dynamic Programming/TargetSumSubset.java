// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/target-sum-subsets-dp-official/ojquestion#

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
        
        boolean[][] dp = new boolean[n+1][target+1];
        
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0 && j==0){
                    dp[i][j] = true;
                }
                else if(i==0){
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j] = true;
                }
                else{
                    if(dp[i-1][j]==true){ // dp[i-1][j] means just above cell 
                        dp[i][j] = true;
                    }
                    else{
                        int val = arr[i-1]; // we take [i-1] because column of dp started from 1 and actual index is 1. 
                        if(j>=val){   // eg val is 7 and j is 10 then only we will use 7 to achieve 10.
                            if(dp[i-1][j-val]==true){ // now 7 contributes so we'll check whether other elements can achieve rest 3 or not.
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][target]);
    }

}