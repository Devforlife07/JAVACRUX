#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void solve()
{
    int n;
    cin >> n;
    int *a = new int[n];
    int sum = 0;
    int i = 0;
    while (i < n)
    {
        cin >> a[i];
        sum += a[i];
        i++;
    }
    if (sum == n)
        cout << 0 << endl;
    else if (sum > n)
        cout << sum - n << endl;
    else
        cout << 1 << endl;
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