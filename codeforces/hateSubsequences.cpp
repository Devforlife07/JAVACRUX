#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        int flag = 0;
        char cc = s[0];
        int pos = 0;
        int opos = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] != cc && !flag)
            {
                flag = 1;
                pos = i;
                cc = s[i];
            }
            else if (s[i] != cc && flag)
            {
                cc = s[i];
                flag = 0;
                ans += min(i - pos, i - opos);
                cout << ans << i << "\n";
                pos = i;
                opos = i;
            }
        }
        cout << ans << "\n";
    }

    return 0;
}