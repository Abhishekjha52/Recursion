//c++ program to reach destination from source using recursion
#include<bits/stdc++.h> 
using namespace std;

void reachHome(int src, int dest) {
    
    cout << "source " << src  << " destination " << dest << endl;
    //base case
    if(src == dest) {
        cout << " pahuch gya " << "\n";
        return;
    }

    //processing - ek step aage badhjao
    src++;

    //recursive call
    reachHome(src, dest);

}

int main() {

    int dest = 10;
    int src = 1;

    cout << "\n";

    reachHome(src, dest);

    return 0;
}
