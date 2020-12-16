// https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int si=0, ei=arr.length;

        while(si < ei){
            int mid = (si + ei) / 2;
            
            if(arr[mid] < target) si = mid + 1;
            else ei = mid;
        }
        
        return ei;
    }
}