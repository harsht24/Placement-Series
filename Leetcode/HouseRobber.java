// https://leetcode.com/problems/house-robber/

class Solution {
    public int rob(int[] arr) {
        
        if(arr.length>1){
        int include = arr[0];
        int exclude = 0;
        
        for(int i=1; i<arr.length; i++){
            int newInclude = exclude + arr[i];
            int newExclude = Math.max(include, exclude);
            
            include = newInclude;
            exclude = newExclude;
        }
            int max = Math.max(include, exclude);
             return max;
        }
        else if(arr.length==1){
            return arr[0];
        }
        else{
            return 0;
        }
    }
}