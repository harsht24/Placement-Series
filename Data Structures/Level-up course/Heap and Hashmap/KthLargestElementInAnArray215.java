// https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int val : nums) pq.add(val);
        
        for(int i=0; i<nums.length-k; i++){
            pq.poll();
        }
        return pq.peek();
    }
}