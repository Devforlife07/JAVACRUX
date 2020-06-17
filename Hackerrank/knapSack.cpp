#include <bits/stdc++.h>
using namespace std;
#define ll long long
int compute(int m, int n, int a[])
{
    ll dp[m + 1][n + 1];
    for (int i = 0; i <= n; i++)
        dp[0][i] = 0;
    for (int i = 0; i <= m; i++)
        dp[i][0] = 0;
    for (int i = 1; i <= m; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (j < a[i - 1])
            {
                dp[i][j] = dp[i - 1][j];
            }
            else
            {
                dp[i][j] = max(dp[i - 1][j], a[i - 1] + dp[i][j - a[i - 1]]);
            }
        }
    }

    return dp[m][n];
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, m;
        cin >> n >> m;
        int a[2000];
        int i = 0;
        int num;
        while (i < n)
        {
            cin >> num;
            a[i] = num;
            i++;
        }
        cout << compute(n, m, a) << "\n";
    }
    return 0;
}