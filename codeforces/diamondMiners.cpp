#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void solve()
{
    int n;
    cin >> n;
    vector<ll> d;
    vector<ll> m;
    int i = 1;
    ll x, y;
    while (i <= 2 * n)
    {
        cin >> x >> y;
        x = abs(x);
        y = abs(y);

        if (!x)
        {
            m.push_back(y);
        }
        else
            d.push_back(x);
        i++;
    }
    sort(m.begin(), m.end());
    sort(d.begin(), d.end());
    // for (auto x : m)
    // {
    //     cout << x << " ";
    // }
    // for (auto x : d)
    // {
    //     cout << x << " ";
    // }

    double ans = 0.0;
    for (i = 0; i < n; i++)
    {
        ans += sqrt(d[i] * d[i] + m[i] * m[i]);
    }
    cout << setprecision(9) << fixed << ans << endl;
}
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
        solve();
    }

    return 0;
}