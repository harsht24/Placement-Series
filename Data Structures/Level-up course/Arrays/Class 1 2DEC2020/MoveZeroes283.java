// https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0; 
        int j = nums.length-1; 
        
        while(i <= j){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else{
                i++;
            }
        }
    }
}