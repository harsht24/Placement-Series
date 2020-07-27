// que - https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        
        int sum=0;
        int[] sum_nums = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            
            sum = sum + nums[i];
            sum_nums[i] = sum;
        }
        return sum_nums;
        
        
    }
}