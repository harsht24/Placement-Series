// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        
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
        return oldSourceStateProfit;
        
        
    }
}