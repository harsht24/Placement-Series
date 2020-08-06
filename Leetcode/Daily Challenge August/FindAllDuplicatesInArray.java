// Find All Duplicates in an Array
//https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3414/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
 
        List<Integer> result = new ArrayList();
        
        for (int n:nums){
            n = Math.abs(n);
            if(nums[n-1]>0){
                nums[n-1] *= -1;
            }
            else{
                result.add(n);
            }
        }
        return result;       
    }
}
