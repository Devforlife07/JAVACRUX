#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    char dp[101][1001];
    cin >> t;
    while (t--)
    {
        int n, m, x, y;
        cin >> n >> m >> x >> y;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                cin >> dp[i][j];
            }
        }
        int i = 0;
        int j = 0;
        ll res = 0;
        while (i < n)
        {
            j = 0;
            if (m == 1)
                res += dp[i][j] == '.' ? x : 0;
            else
            {
                while (j < m)
                {
                    if (dp[i][j] == '.')
                    {
                        if (j <= m - 1 && dp[i][j + 1] == '.')
                        {
                            res += min(2 * x, y);
                            j += 2;
                        }
                        else
                        {
                            res += x;
                            j++;
                        }
                    }
                    else
                    {
                        j++;
                    }
                }
            }

            i++;
        }
        cout << res << '\n';
    }

    return 0;
}