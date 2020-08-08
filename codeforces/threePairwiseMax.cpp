#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    // cout << "YES" << '\n';
    int t;
    cin >> t;
    while (t--)
    {
        ll x, y, z;
        bool flag = 1;
        cin >> x >> y >> z;
        ll m = max(x, max(y, z));
        if (x == y && y == z)
        {
            cout << "YES" << '\n';
            cout << x << " " << x << " " << x << '\n';
        }
        else if (x == y && x == m)
        {
            cout << "YES" << '\n';
            cout << x << " " << z << " " << 1 << '\n';
        }
        else if (y == z && y == m)
        {
            cout << "YES" << '\n';
            cout << 1 << " " << x << " " << y << '\n';
        }
        else if (x == z && x == m)
        {
            cout << "YES" << '\n';
            cout << x << " " << y << " " << 1 << '\n';
        }
        else
        {
            cout << "NO" << '\n';
        }
    }

    return 0;
}