//c++ program to find the subsets of a gievn array
#include<bits/stdc++.h>
using namespace std;
void solve(vector<int>nums, vector<int>output, int index, vector<vector<int>>&ans)
{
    //base case
    if(index>=nums.size())
    {
        ans.push_back(output);
        return;
    }
    
    //exclude value
    solve(nums,output, index+1,ans);
    
    //include value
    int element=nums[index];
    output.push_back(element);
    solve(nums,output,index+1,ans);
}
vector<vector<int>> subsets(vector<int>& nums) {
    int n=nums.size();
    vector<vector<int>>ans;
    vector<int>output;
    int index=0;
    solve(nums, output, index, ans);
    return ans;
        
    
}
int main()
{
    int n;cin>>n;
    vector<int>v(n);
    for(int i=0;i<n;i++)
        cin>>v[i];
    vector<vector<int>>ans=subsets(v,n);
    for(auto x:v)
    {
        for(auto y:x)
            cout<<y<<" ";
        cout<<"\n";
    }
    return 0;   
}