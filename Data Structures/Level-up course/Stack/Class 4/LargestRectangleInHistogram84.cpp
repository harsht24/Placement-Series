// https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/

class Solution {
public:
    int largestRectangleArea(vector<int> &heights)
{
    int n = heights.size();
    vector<int> left = nsol(heights);
    vector<int> right = nsor(heights);

    int area = 0;
    for (int i = 0; i < n; i++)
    {
        int h = heights[i];
        int w = right[i] - left[i] - 1;
        area = max(area, h * w);
    }

    return area;
}

vector<int> nsor(vector<int> &arr)
{
    int n = arr.size();
    vector<int> ans(n, n);

    stack<int> st;
    for (int i = 0; i < n; i++)
    {
        while (st.size() != 0 && arr[st.top()] > arr[i])
        {
            ans[st.top()] = i;
            st.pop();
        }

        st.push(i);
    }

    return ans;
}

vector<int> nsol(vector<int> &arr)
{
    int n = arr.size();
    vector<int> ans(n, -1);

    stack<int> st;
    for (int i = n - 1; i >= 0; i--)
    {
        while (st.size() != 0 && arr[st.top()] > arr[i])
        {
            ans[st.top()] = i;
            st.pop();
        }

        st.push(i);
    }

    return ans;
}
};