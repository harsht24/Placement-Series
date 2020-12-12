// https://leetcode.com/problems/count-number-of-nice-subarrays/

class Solution {
    public int numberOfSubarraysKAtmost(int[] arr, int k) {
        int si = 0, ei = 0, oddCount = 0, res = 0, n = arr.length;
        
        while(ei < n){
            if((arr[ei++] & 1)!=0) oddCount++;
            
            while(oddCount > k){
                if((arr[si++] & 1)!=0) oddCount--;
            }
            res += ei-si;
        }
        return res;
    }
    public int numberOfSubarrays(int[] arr, int k){
        int n = arr.length;
        
        if(n==0) return 0;
        
        return numberOfSubarraysKAtmost(arr, k) - numberOfSubarraysKAtmost(arr, k-1);
    }
}