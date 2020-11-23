// https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int ele : nums){
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele, 0);
            }
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[1]-b[1]; });
        
        for(int ele : map.keySet()){ 
            pq.add(new int[]{ele, map.get(ele)});
            if(pq.size()>k) pq.remove();
        }
        
        int[] ans = new int[k];
        int idx=0;
        
        while(k-- > 0){
            int[] d = pq.remove();
            ans[idx++] = d[0];
        }
        return ans;
    }
}