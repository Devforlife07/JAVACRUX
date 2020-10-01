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
        ll x;
        cin >> x;
        ll z = 1;
        ll total_till_now = 0;
        int ans = 0;
        while (total_till_now < x)
        {
            total_till_now = (z * (z + 1)) / 2;
            z = (z * 2) + 1;
            x -= total_till_now;
            ans++;
        }
        if (x < 0)
            ans--;
        cout << ans << '\n';
    }

    return 0;
}