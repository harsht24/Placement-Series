//https://leetcode.com/problems/trapping-rain-water/

// USING STACK 

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        stack<int> st;
        st.push(0);
        int water = 0;
       for(int i=1; i<n; i++){
           
           while(st.size()>0 && height[i] > height[st.top()]){
               int h = height[st.top()];
               
               st.pop();
               
               if(st.size()==0) break;
               
               int w = i - st.top() - 1;
               water += w * (min(height[st.top()] , height[i])-h);
               
           }
           st.push(i);
       }
        return water;
    }
};