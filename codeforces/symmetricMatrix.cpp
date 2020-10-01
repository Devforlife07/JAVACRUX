#include <bits/stdc++.h>
#define ll long long
using namespace std;
void solve()
{
    int n, m;
    cin >> n >> m;

    int flag = 0;
    int r1, r2, r3, r4;
    for (int j = 1; j <= n; j++)
    {
        cin >> r1 >> r2;
        cin >> r3 >> r4;
        // cout << r1 << " " << r2 << " " << r3 << " " << r4 << endl;
        if (r2 == r3)
            flag = 1;
    }
    if (m % 2 == 1)
    {
        cout << "NO" << '\n';
        return;
    }
    if (flag)
        cout << "YES" << '\n';
    else
        cout << "NO" << '\n';
    return;
}
int main()
{
    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);
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