import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] values = new int[n];
        for(int i=0; i<n; i++){
            values[i] = sc.nextInt();
        }
        
        int[] weights = new int[n];
        for(int i=0; i<n; i++){
            weights[i] = sc.nextInt();
        }
        
        int capacity = sc.nextInt();
        
        int[][] dp = new int[n+1][capacity+1];
        
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                 if(j>= weights[i-1]){ // whether j is eligible to bat or not
                     int remainingCapacity = j - weights[i-1]; // remainingCapcity are remaining runs left for the team after j's batting.
                     
                     if(dp[i-1][remainingCapacity]+values[i-1] > dp[i-1][j]){
                         dp[i][j] = dp[i-1][remainingCapacity]+values[i-1];
                     }
                     else{
                         dp[i][j] = dp[i-1][j]; // when i doesn't bat
                     }
                 }
                 else{
                     dp[i][j] = dp[i-1][j]; // when i doesn't bat
                 }
            }
        }
        System.out.println(dp[n][capacity]);
    }
}