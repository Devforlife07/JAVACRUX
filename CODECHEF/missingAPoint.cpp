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
        ll n;
        cin >> n;
        ll x = 0, y = 0;
        int i = 1;
        while (i <= (4 * n) - 1)
        {
            ll tempx, tempy;
            cin >> tempx >> tempy;
            // cout << tempx << " " << tempy << '\n';
            x ^= tempx;
            y ^= tempy;
            i++;
        }
        cout << x << " " << y << '\n';
    }
    return 0;
}