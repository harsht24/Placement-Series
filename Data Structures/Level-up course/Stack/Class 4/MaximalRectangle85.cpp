// https://leetcode.com/problems/maximal-rectangle/

class Solution {
public:
    int maximalRectangle(vector<vector<char>> &matrix)
{
    if (matrix.size() == 0 || matrix[0].size() == 0)
        return 0;
    int n = matrix.size();
    int m = matrix[0].size();
    vector<int> arr(m, 0);

    int area = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            arr[j] = matrix[i][j] == '1' ? arr[j] + 1 : 0;
        }

        area = max(largestRectangleArea(arr), area);
    }

    return area;
}

int largestRectangleArea(vector<int> &heights)
{
    int n = heights.size();
    stack<int> st;
    st.push(-1);

    int area = 0;
    for (int i = 0; i < n; i++)
    {
        while (st.top() != -1 && heights[st.top()] >= heights[i])
        {
            int h = heights[st.top()];
            st.pop();

            int w = i - st.top() - 1;
            area = max(area, h * w);
        }
        st.push(i);
    }

    while (st.size() != 1)
    {
        int h = heights[st.top()];
        st.pop();

        int w = n - st.top() - 1;
        area = max(area, h * w);
    }

    return area;
}
};