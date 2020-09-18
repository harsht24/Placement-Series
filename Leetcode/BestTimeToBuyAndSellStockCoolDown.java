// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/submissions/

class Solution {
    public int maxProfit(int[] arr) {
        
        if(arr.length > 0){
         int obsp = -arr[0]; // old bought state profit
        int ossp = 0;       // old sold state profit
        int ocsp = 0;       // old cooled state profit
        
        for(int i=0; i<arr.length; i++){
            int nbsp = 0;       // new bought state profit
            int nssp = 0;       // new sold state profit
            int ncsp = 0;       // new cooled state profit
            
            if(ocsp - arr[i] > obsp){
                nbsp = ocsp - arr[i];
            }
            else{
                nbsp = obsp;
            }
            
            if(obsp + arr[i] > ossp){
                nssp = obsp + arr[i];
            }
            else{
                nssp = ossp;
            }
            
            if(ossp > ocsp){
                ncsp = ossp;
            }
            else{
                ncsp = ocsp;
            }
            
            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp; 
        }
        return ossp;
        }
        else{
            return 0;
        }
    }
}