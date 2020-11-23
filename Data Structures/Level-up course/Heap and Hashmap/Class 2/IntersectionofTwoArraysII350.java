// https://leetcode.com/problems/intersection-of-two-arrays-ii/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int ele : nums1){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        
        for(int ele : nums2){
            if(map.containsKey(ele)){
                arr.add(ele);
                map.put(ele, map.get(ele)-1);
                
                if(map.get(ele)==0) map.remove(ele);
            }    
        }
        int i=0;
        int[] res = new int[arr.size()];
        for(int ele : arr) res[i++]=ele;
        return res;
    }
}