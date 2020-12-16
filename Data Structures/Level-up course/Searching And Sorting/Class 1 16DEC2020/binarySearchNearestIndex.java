class Solution {
    public int binarySearchNearestIndex(int[] arr, int target) {
        int n = arr.length;
        if(n==0) return -1;
        
        int si=0, ei=n-1;
        
        if(target <= arr[0] || target >= arr[n-1]) return target <= arr[0] ? 0 : n-1;
        
        while(si <= ei){
            int mid = (si + ei) / 2;
            
            if(arr[mid]==target) return mid;
            else if(arr[mid] < target) si = mid + 1;
            else ei = mid-1;
        }
        
        return ((target-arr[ei] < arr[si] - target) ? ei : si);
    }
}