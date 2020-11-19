// https://leetcode.com/problems/remove-duplicate-letters/

class Solution {
public:
    string removeDuplicateLetters(string s) {
        if(s.length()==0) return s;
        
        int n = s.length();
        vector<int> freq(26, 0);
        vector<int> vis(26, false);
            
        for(char ch : s) freq[ch-'a']++;
        
        vector<char> st;
        for(char ch : s){ 
            
            freq[ch-'a']--;
            
            if(vis[ch-'a']) continue;
            
            while(st.size()>0 && st.back()>ch && freq[st.back()-'a']>0){
                vis[st.back()-'a'] = false;
                st.pop_back();
            }
            
            vis[ch-'a']++;
            st.push_back(ch);    
        }
        string ans = "";
        for(char ch : st) ans += ch;
        
        return ans;
        
    }
};