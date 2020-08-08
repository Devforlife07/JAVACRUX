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
        ll x, y;
        cin >> x >> y;
        if (y >= 2 * x)
        {
            cout << x << " " << (2 * x) << '\n';
        }
        else
            cout << -1 << " " << -1 << '\n';
    }

    return 0;
}