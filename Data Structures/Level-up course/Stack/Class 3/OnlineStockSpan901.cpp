// https://leetcode.com/problems/online-stock-span/submissions/

class StockSpanner {
public:
    stack<pair<int,int>> st;
    int idx=0;
    
    StockSpanner() {
        st.push({-1,-1});
    }
    
    int next(int price) {
        while(st.top().first != -1 &&  st.top().second <= price) st.pop();
        
        int span = idx - st.top().first;
        st.push({idx, price});
        idx += 1;
        return span;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */