#include <bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie();
    int n;
    ll num;
    cin >> n;
    if (n >= 130)
    {
        cout << "Yes" << '\n';
        return 0;
    }
    ll a[1000000];

    for (int i = 0; i < n; i++)
    {
        cin >> num;
        a[i] = num;
    }
    sort(a, a + n);
    for (int i = 0; i < n; i++)
    {
        ll x = a[i];
        for (int j = i + 1; j < n; j++)
        {
            ll y = a[j];
            for (int k = j + 1; k < n; k++)
            {
                ll z = a[k];
                ll xo = x ^ y ^ z;
                if (binary_search(a + k, a + n, xo))
                {
                    cout << "Yes" << '\n';
                    return 0;
                }
            }
        }
    }

    return 0;
}