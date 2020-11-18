// https://leetcode.com/problems/trapping-rain-water/

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        
        vector<int> left(n,0);
        vector<int> right(n,0);
        
        int prev = 0;
        for(int i=0; i<n; i++){
            left[i] = max(prev, height[i]);
            prev = left[i];
        }
        
        prev = 0;
        for(int i=n-1; i>=0; i--){
            right[i] = max(prev, height[i]);
            prev = right[i];
        }
        
        int water = 0;
        for(int i=0; i<n; i++){
            water += min(left[i], right[i]) - height[i];
        }
        
        return water;
    }
};