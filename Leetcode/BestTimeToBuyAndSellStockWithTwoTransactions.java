// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
// 123. Best Time to Buy and Sell Stock III - HARD 
class Solution {
    public int maxProfit(int[] arr) {
         int mpist = 0; // Max profit if sold today
        int leastsf = arr[0]; // least so far
        
        int[] dpLeft = new int[arr.length]; // dp maximum profit if sold upto today.
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] < leastsf){
                leastsf = arr[i];
            }
            
            mpist = arr[i] - leastsf;
            if(mpist > dpLeft[i-1]){
                dpLeft[i] = mpist;
            }
            else{
                dpLeft[i] = dpLeft[i-1];
            }
        }
        
        int mpibt = 0; // Maximum profit if bought today.
        int maxat = arr[arr.length-1]; // maximum after today
        int[] dpRight = new int[arr.length]; // dp maximum profit on the right side
        
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] > maxat){
                maxat = arr[i];
            }
            
            mpibt = maxat - arr[i];
            if(mpibt > dpRight[i+1]){
                dpRight[i] = mpibt;
            }
            else{
                dpRight[i] = dpRight[i+1];
            }
            
        }
        
        int overallProfit = 0;
        for(int i=0; i<arr.length; i++){
            if(dpLeft[i] + dpRight[i] > overallProfit){
                overallProfit = dpLeft[i] + dpRight[i];
            }
            
        }
        return overallProfit;
    }
}