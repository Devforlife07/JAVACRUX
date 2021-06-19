#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void solve()
{
    int n;
    cin >> n;
    int i = 0;
    int x;
    unordered_map<int, int> m;
    int diff;
    ll ans = 0;
    while (i < n)
    {
        cin >> x;
        diff = x - i;
        ans += m[diff];
        m[diff]++;
        i++;
    }
    cout << ans << endl;
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