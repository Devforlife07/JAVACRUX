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
        int n, k;
        cin >> n >> k;
        if ((n & 1) && (k == n / 2))
            cout << n - 1 << '\n';
        else if (k >= n / 2)
        {
            ll len = (n - 1) - k;
            cout << len * 2 << "\n";
        }
        else
        {
            ll len = k;
            cout << len * 2 + 1 << '\n';
        }
    }

    return 0;
}