// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/paint-house-many-colors-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        
        int[][] arr = new int[n][c];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][c];
        
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;  // second least
        
        for(int j=0; j<arr[0].length; j++){
            dp[0][j] = arr[0][j];
            
            if(arr[0][j] <= least){
                sleast = least;
                least = arr[0][j];
            }else if(arr[0][j] <= sleast){
                sleast = arr[0][j];
            }
        }
        for(int i=1; i<arr.length; i++){
            int nleast = Integer.MAX_VALUE;  // new least
            int nsleast = Integer.MAX_VALUE;  // new second least
            
            for(int j=0; j<arr[0].length; j++){
                if(dp[i-1][j] == least){
                    dp[i][j] = sleast + arr[i][j];
                }
                else{
                    dp[i][j] = least + arr[i][j];
                }
                
                if(dp[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                }
                else if(dp[i][j] <= nsleast){
                    nsleast = dp[i][j];
                }
            }
            least = nleast;
            sleast = nsleast;
        }
        
        System.out.println(least);
    }
}