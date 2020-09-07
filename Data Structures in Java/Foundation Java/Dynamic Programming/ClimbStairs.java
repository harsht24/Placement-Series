import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(countPathsMemoization(n, new int[n+1]));
        System.out.println(countPathsTabulation(n));
        
    }
    public static int countPathsMemoization(int n, int[] qb){
        if(n==0){
            return 1;
        }else if(n<0){
            return 0;
        }
        
        if(qb[n]!=0){
            return qb[n];
        }
        
        int nm1 = countPathsMemoization(n-1, qb);
        int nm2 = countPathsMemoization(n-2, qb);
        int nm3 = countPathsMemoization(n-3, qb);
        
        int totalPath = nm1 + nm2 + nm3;
        
        qb[n] = totalPath;
        
        return totalPath;
    }
    
    public static int countPathsTabulation(int n){
    
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        
        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] = dp[i-1];
            }
            else if(i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
    
    
    return dp[n];
    
    
    }

}