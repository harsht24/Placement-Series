// https://leetcode.com/problems/sort-colors/submissions/

class Solution {
    public void sortColors(int[] arr) {
        
       int i = 0, j = 0, k = arr.length-1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else {
                swap(arr, i, k);
                k--;
            }
        }
    }
    
       public void swap(int[] nums, int a, int b){
            int temp = nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
        }
    
}