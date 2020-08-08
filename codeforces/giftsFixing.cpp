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
        int n;
        cin>>n;
        ll a[1000];
        ll b[1000];
        int i = 1;
        ll temp;
        int mina = INT32_MAX;
        while (i<=n) {
            cin>>temp;
            mina = temp<mina?temp:mina;
            a[i]=temp;
            i++;
        }
        int minb = INT32_MAX;
        i  = 1;
        while (i<=n) {
            cin>>temp;
            minb = temp<minb?temp:minb;
            b[i]= temp;
            i++;
        }
        ll count  = 0;
        for (int i = 1;i<=n;i++) {
            count+= max((a[i]-mina), (b[i]-minb));
        }
        cout<<count<<'\n';

    }

    return 0;
}