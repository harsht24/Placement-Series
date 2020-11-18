// https://leetcode.com/problems/trapping-rain-water/

// IMPLEMENT WITHOUT USING EXTRA SPACE
// TIME O(1) AND SPACE O(n)

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size()-1;
        int water=0, i=0, j=n, lmax=0, rmax=0;
        
        while(i<j){
            lmax = max(lmax, height[i]);
            rmax = max(rmax, height[j]);
            
            if(lmax <= rmax){
                water += lmax - height[i];
                i++;
            }
            else{
                water += rmax - height[j];
                j--;
            }
        }
        return water;
    }
};