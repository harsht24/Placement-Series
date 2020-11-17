// https://leetcode.com/problems/remove-k-digits/

class Solution {
public:
    string removeKdigits(string num, int k) {
        if(num.length() < k){
            return "";
        }
        vector<char> st;
        
        for(int i=0; i<num.length(); i++){
            int x = num[i];
            while(st.size()!=0 && k>0 && st.back() > x){
                st.pop_back();
                k--;
            }
            
            if(st.size()==0 && x=='0') continue;
            
            st.push_back(x);
            
        }
        
        while(st.size()!=0 && k-- > 0){
            st.pop_back();
        }
        
        string ans = "";
        
        for(int i=0; i<st.size(); i++){
            ans += st[i];
        }
        
        return ans.length()==0? "0": ans;
    }
};