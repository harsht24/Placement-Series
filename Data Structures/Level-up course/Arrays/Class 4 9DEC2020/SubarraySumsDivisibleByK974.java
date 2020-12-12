// https://leetcode.com/problems/subarray-sums-divisible-by-k/submissions/

class Solution {
    public int subarraysDivByK(int[] arr, int K) {
        int n = arr.length;
        if(n==0) return 0;
        
        int[] map = new int[K+1];
        map[0] = 1;
        
        int sum=0, count=0;
        
        for(int i=0; i<n; i++){
            
            sum += arr[i];
            int SUM = (sum % K + K) % K;
            count += map[SUM];
            map[SUM]++;
            
            
        }
        
        return count;
    }
}