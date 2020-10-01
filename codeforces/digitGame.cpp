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
        int n;
        cin >> n;
        string s;
        cin >> s;
        int ans = 0;
        if (n % 2)
        {
            int flag = 0;
            for (int i = 0; i < n; i += 2)
            {
                if ((s[i] - '0') % 2 != 0)
                {
                    flag = 1;
                    ans = 1;
                    break;
                }
                if (flag)
                {
                    break;
                }
            }
            if (!flag)
            {
                ans = 2;
            }
        }
        else
        {
            int flag = 0;
            for (int i = 1; i < n; i += 2)
            {
                if ((s[i] - '0') % 2 == 0)
                {
                    flag = 1;
                    ans = 2;
                    break;
                }
                if (flag)
                {
                    break;
                }
            }
            if (!flag)
            {
                ans = 1;
            }
        }
        cout << ans << '\n';
    }

    return 0;
}