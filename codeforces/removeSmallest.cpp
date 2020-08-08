#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    while (t--) {
        set<ll> st;
        int n;
        cin>>n;
        int i = 1;
        ll temp;
        while (i<=n) {
            cin>>temp;
            st.insert(temp);
            i++;
        }
        int prev = *(st.begin());
        int flag = 0;
        for (auto x: st) {
            int curr = x;;
            if (abs(curr-prev)>1) {
                flag = 1;
                break;
            }
            prev = curr;
        }
        if (flag == 0)
            cout<<"YES"<<'\n';
        else
        {
            cout<<"NO"<<'\n';
        }

    }
    return 0;
}