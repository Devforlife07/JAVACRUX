#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int  t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        for (int i = 1;i<=n;i++)
            cout<<i<<" ";
        cout<<"\n";
    }

    return 0;
}