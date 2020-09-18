// https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/buy-sell-stocks-transaction-fee-ita-official/ojquestion#

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
        int fee = sc.nextInt();
        
        int oldBoughtStateProfit = -prices[0];
        int oldSourceStateProfit = 0;
        
        for(int i=1; i<prices.length; i++){
            int newBoughtStateProfit = 0;
            int newSourceStateProfit = 0;
            
            if(oldSourceStateProfit - prices[i] > oldBoughtStateProfit){
                newBoughtStateProfit = oldSourceStateProfit - prices[i];
            }
            else{
                newBoughtStateProfit = oldBoughtStateProfit;
            }
            
            if(oldBoughtStateProfit + prices[i] - fee > oldSourceStateProfit){
                newSourceStateProfit = oldBoughtStateProfit + prices[i] - fee;
            }
            else{
                newSourceStateProfit = oldSourceStateProfit;
            }
            oldBoughtStateProfit = newBoughtStateProfit;
            oldSourceStateProfit = newSourceStateProfit;
        }
        System.out.println(oldSourceStateProfit);
        
    }

}