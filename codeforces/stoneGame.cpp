#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void solve()
{
    int n;
    cin >> n;
    int a[n];
    int min = INT_MAX, mini;
    int max = INT_MIN, maxi;
    int i = 0;
    int x;
    while (i < n)
    {
        cin >> x;
        a[i] = x;
        if (x < min)
        {
            min = x;
            mini = i;
        }
        if (x > max)
        {
            max = x;
            maxi = i;
        }
        i++;
    }
    int mid = n / 2;
    if (mini <= mid and maxi <= mid)
    {
        cout << std::max(mini, maxi) + 1 << endl;
    }
    else if (mini >= mid and maxi >= mid)
    {
        int op1 = n - mini;
        int op2 = n - maxi;
        cout << std::max(op1, op2) << endl;
    }
    else
    {
        if (mini < maxi)
        {
            int ans1 = std::min((mini + 1 + (std::min(maxi - mini, n - maxi))), n - maxi + std::min(mini + 1, maxi - mini));
            cout << ans1 << endl;
        }
        else
        {
            int ans2 = std::min((maxi + 1 + (std::min(mini - maxi, n - mini))), n - mini + std::min(maxi + 1, mini - maxi));
            cout << ans2 << endl;
        }
    }
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