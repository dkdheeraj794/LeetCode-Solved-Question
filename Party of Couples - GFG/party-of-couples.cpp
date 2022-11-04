//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    int findSingle(int N, int arr[]){
        //vector<int>ans;
       // sort(arr , arr+N);
        for(int i=0;i<N;++i){
            int cnt=0;
             for(int j=0;j<N;++j){
                 if(arr[i]==arr[j]){
                     cnt++;
                 }
             }
             if(cnt==1){
                 return arr[i];
             }
        }
        return -1;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N, X;
        cin >> N;
        int arr[N];
        for(int i = 0; i < N; i++){
            cin >> arr[i];
        }
        
        Solution ob;
        cout << ob.findSingle(N, arr) << endl;
    }
    return 0; 
} 
// } Driver Code Ends