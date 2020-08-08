#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll r;
    int c;
    cin >> r >> c;
    ll ans = 0;
    if (r & 1)
        ans = (10 * (r / 2)) + (2 * (c - 1));
    else
    {
        ans = (10 * (r / 2)) + 1 + (2 * (c - 1));
    }

    cout << ans << '\n';

    return 0;
}