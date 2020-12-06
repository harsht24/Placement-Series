// https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0) return;
      int  n = nums.length;
        k = (k%n+n)%n;
        
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    public void reverse(int[] nums, int l, int r){
        int left=l, right=r;
        
        while(left<right){
            swap(nums, left++, right--);
        }
    }
    
    public void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}