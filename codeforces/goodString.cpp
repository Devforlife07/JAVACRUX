#include <bits/stdc++.h>
#define ll long long
using namespace std;
void getResult(string s)
{
    int ans = 2;
    for (char i = '0'; i <= '9'; i++)
    {
        for (char j = '0'; j <= '9'; j++)
        {
            int c = 0;
            for (int x = 0; x < s.length(); x++)
            {
                if (c & 1)
                {
                    if (s[x] == j)
                        c++;
                }
                else
                {
                    if (s[x] == i)
                        c++;
                }
            }
            if (i != j)
            {
                if (c & 1)
                {
                    c--;
                }
            }
            ans = max(ans, c);
        }
    }
    cout << (s.length() - ans) << '\n';
}
void solve()
{
    string s;
    cin >> s;
    getResult(s);
    return;
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
        solve();

    return 0;
}