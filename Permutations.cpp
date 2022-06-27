//c++ program to find the permutations of a string
#include<bits/stdc++.h>
using namespace std;
void solve(string s, int index, vector<string>&ans)
{
    //base case
    if(index>=s.length())
    {
        ans.push_back(s);
        return;
    }

    for(int i=index;i<s.length();i++)
    {
        swap(s[index],s[i]);
        solve(s, index+1, ans);
        //backtrack
        swap(s[index], s[i]);
    }
}
vector<string> permutations(string s)
{
    vector<string>ans;
    int n=s.length();
    if(n==0)
        return ans;
    int index=0;
    solve(s, index, ans);
    return ans;
}
int main()
{
    string s;cin>>s;
    vector<string>ans=permutations(s);
    for(auto x:ans)
        cout<<x<<" ";
    return 0;
}