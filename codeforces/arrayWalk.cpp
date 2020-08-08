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
    cin >> t;
    while (t--)
    {
        int a[1000000];
        int n, k, z;
        cin >> n >> k >> z;
        int i = 0;
        ll temp;
        while (i < n)
        {
            cin >> temp;
            a[i] = temp;
            i++;
        }
        ll global = a[0];
        int j = 1;
        ll ans = INT32_MIN;
        for (; j <= k; j++)
        {
            global += a[j];
            ll curr = global;
            ll times = min(k - j, z);
            curr += (a[j] + a[j - 1]) * times;
            ll rem = k - (2 * times) - j;
            for (ll x = j + 1; x <= rem && x < n; x++)
                curr += a[x];

            ans = curr > ans ? curr : ans;
        }
        cout << max(ans, global) << '\n';
    }

    return 0;
}