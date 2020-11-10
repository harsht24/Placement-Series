// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-and-sell-stocks-ota-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        
        int leastSoFar = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profitIfSoldToday = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i] < leastSoFar){
                leastSoFar = prices[i];
            }
            
            profitIfSoldToday = prices[i] - leastSoFar;
            
            if(profitIfSoldToday > overallProfit){
                overallProfit = profitIfSoldToday;
            }
        }
        System.out.println(overallProfit);
    }

}