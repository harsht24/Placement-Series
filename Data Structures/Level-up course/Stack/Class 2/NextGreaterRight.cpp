#include<iostream>
#include<stack>

using namespace std;

void ngor(vector<int>& arr){
    int n=arr.size();
    vector<int> ans(n, n);

    stack<int> st;

    for(int i=0; i<n; i++){
        while(st.size()>0 && arr[st.top() < arr[i]]){
            ans[st.top()] = i
            st.pop();
        }
        st.push(i);
    }
}

int main(){

}