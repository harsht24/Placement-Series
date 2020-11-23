// https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen=0;
        
        for(int ele : nums) map.put(ele, 1);
        
        for(int ele : nums){
            if(!map.containsKey(ele)) continue;
            
            int prev = ele-1;
            int next = ele+1;
            int len=0;
            while(map.containsKey(prev)){
                map.remove(prev);
                prev--;
            }
            
            while(map.containsKey(next)){
                map.remove(next);
                next++;
            }
            map.remove(ele);
            len = next-prev-1;
            
            maxLen = Math.max(maxLen, len);
        }
            return maxLen;
    }
}