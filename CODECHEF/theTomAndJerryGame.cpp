#include <bits/stdc++.h>
using namespace std;
#define ll unsigned long long
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        ll ts;
        cin >> ts;
        if (ts & 1)
        {
            cout << (ll)ts / 2 << "\n";
        }
        else
        {
            ll j;
            int pos = 0;
            ll copy = ts;
            while (!(copy & 1))
            {
                pos++;
                copy >>= 1;
            }
            j = 1ll << (pos + 1);
            cout << ts / j << "\n";
        }
    }

    return 0;
}