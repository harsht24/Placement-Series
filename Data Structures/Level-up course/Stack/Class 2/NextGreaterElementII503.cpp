// https://leetcode.com/problems/next-greater-element-ii/

class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& arr) {
        int n=arr.size();
        vector<int> ans(n, -1);

        stack<int> st;

        for(int i=0; i<2*n; i++){
            while(st.size()!=0 && arr[st.top()] < arr[i%n]){
                ans[st.top()] = arr[i%n];
                st.pop();
            }
             //   if(st.size()!=0 && st.top()==(i%n)) break;
            
            if(i<n){
                    st.push(i);
                }
            
            
        }
        
        
        return ans;
    }
};