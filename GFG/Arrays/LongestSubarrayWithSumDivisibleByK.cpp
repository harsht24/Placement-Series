// https://practice.geeksforgeeks.org/problems/longest-subarray-with-sum-divisible-by-k1259/1

// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

 // } Driver Code Ends


//User function template for C++
class Solution{
public:	
	int longSubarrWthSumDivByK(int arr[], int n, int K)
	{
     
        if(n==0) return 0;
        
        int len=0;
        unordered_map<int, int> map;
        map[0] = -1;
        
        int sum=0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            
            int SUM = (sum % K + K) % K;
            if(map.find(SUM)!=map.end()) len = max(len, i-map[SUM]);
            else map[SUM] = i;
        }
        return len;
	}
};

// { Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n,k,i;
	cin>>n>>k; int arr[n];
	for(i=0;i<n;i++)
	cin>>arr[i];
	Solution ob;
	cout<<ob.longSubarrWthSumDivByK(arr, n, k)<<"\n";
	}
	return 0;	 
}
  // } Driver Code Ends