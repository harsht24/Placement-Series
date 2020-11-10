// https://leetcode.com/problems/remove-outermost-parentheses/

class Solution {
public:
    string removeOuterParentheses(string s) {
        string ans = "";
        int count=0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s[i];
            
            if(ch=='(' && count++ > 0){
                ans += '(';
            }
            else if(ch==')' && count-->1){
                ans += ch;
            }
        }
        return ans;
    }
};