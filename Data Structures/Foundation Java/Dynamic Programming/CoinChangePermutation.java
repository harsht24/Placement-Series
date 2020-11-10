// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-permutations-official/ojquestion#

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
        
        int[] dp = new int[target+1];
        dp[0] = 1;
                
        for(int amt=1; amt<=target; amt++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] <= amt){
                    int remainingAmt = amt - arr[j];
                    dp[amt] += dp[remainingAmt];
                }
                
            }
        }
        System.out.println(dp[target]);
    }
}