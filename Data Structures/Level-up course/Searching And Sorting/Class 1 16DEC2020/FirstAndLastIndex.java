// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

// 34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        res[0] = binarySearchFirstIndex(nums, target);
        res[1] = binarySearchLastIndex(nums, target);
        
        return res;
    }
    
    public int binarySearchFirstIndex(int[] arr, int target){
        
        int si = 0, ei = arr.length-1;
        
        while(si <= ei){
            int mid = (ei + si) / 2;
            
            if(arr[mid]==target){
                if(mid-1 >= 0 && arr[mid-1]==target) ei = mid-1;
                else return mid;
            }
            
            else if(arr[mid] > target) ei = mid-1;
            else si = mid+1;
        }
        return -1;
    }
    
        public int binarySearchLastIndex(int[] arr, int target){
        
        int si = 0, ei = arr.length-1;
        
        while(si <= ei){
            int mid = (ei + si) / 2;
            
            if(arr[mid]==target){
                if(mid+1 < arr.length && arr[mid+1]==target) si = mid+1;
                else return mid;
            }
            
            else if(arr[mid] > target) ei = mid-1;
            else si = mid+1;
        }
        return -1;
    }
}