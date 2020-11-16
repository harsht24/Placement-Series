//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/submissions/

class Solution {
public:
    string minRemoveToMakeValid(string s)
{

    stack<int> st;
    for (int i = 0; i < s.length(); i++)
    {
        char ch = s[i];
        if (ch == ')')
        {
            if (st.size() != 0)
                st.pop();
            else
                s[i] = '#';
        }
        else if (ch == '(')
        {
            st.push(i);
        }
    }

    while (st.size() != 0)
    {
        s[st.top()] = '#';
        st.pop();
    }

    string ans = "";
    for (int i = 0; i < s.length(); i++)
    {
        char ch = s[i];
        if (ch != '#')
        {
            ans += ch;
        }
    }

    return ans;
}
};