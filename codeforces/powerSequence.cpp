#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;
    ll a[1000000];
    int i = 0;
    ll t;
    while (i < n)
    {
        cin >> t;
        a[i] = t;
        i++;
    }
    sort(a, a + n);
    ll cmax = 0;
    while (pow(cmax, n - 1) < pow(10, 10))
    {
        cmax++;
    }
    cmax--;
    ll ans = INT_MAX;
    ll temp = 0;
    for (int i = 1; i <= cmax; i++)
    {
        for (int j = 0; j < n; j++)
            temp += abs(a[j] - pow(i, j));
        ans = min(ans, temp);
    }

    cout << ans << '\n';

    return 0;
}