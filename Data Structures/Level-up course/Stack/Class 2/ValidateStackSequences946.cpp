// https://leetcode.com/problems/validate-stack-sequences/

class Solution {
public:
    bool validateStackSequences(vector<int>& pushed, vector<int>& popped) {
        stack<int> st;
        int i=0;
        
        for(int ele : pushed){
            st.push(ele);
            while(st.size()!=0 && st.top()==popped[i]){
                st.pop();
                i++;
            }
            
        }
        return st.size()==0;
        
    }
};