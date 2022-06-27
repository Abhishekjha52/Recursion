class Solution {
public:
    void solve(string digits, int index, string output, vector<string>&ans, string mapping[])
    {
        //base case
        if(index>=digits.length())
        {
            ans.push_back(output);
            return;
        }
        
        int number=digits[index]-'0';
        string value=mapping[number];
        
        for(int i=0;i<value.length();i++)
        {
            output.push_back(value[i]);
            solve(digits, index+1, output, ans, mapping);
            
            //backtrack
            output.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        int n=digits.length();
        vector<string>ans;
        if(n==0)return ans;
        string output="";
        int index=0;
        string mapping[10]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits, index, output, ans, mapping);
        return ans;
    }
};