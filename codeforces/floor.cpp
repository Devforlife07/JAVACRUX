#include <bits/stdc++.h>
#define ll long long
using namespace std;
void solve()
{
    int n, x;
    cin >> n >> x;
    if (n <= 2)
    {
        cout << 1 << '\n';
        return;
    }
    n -= 2;
    int ans = 0;
    ans += n / x;
    if (n % x)
    {
        ans += 1;
    }
    ans += 1;
    cout << ans << '\n';
    return;
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