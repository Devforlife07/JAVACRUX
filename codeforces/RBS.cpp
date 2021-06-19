#include <bits/stdc++.h>
#define ll long long
using namespace std;
bool solve()
{
    string s;
    cin >> s;
    int open = 0, close = 0, ques = 0;
    if ((s.size()) % 2)
    {
        return false;
    }
    int n = s.length();
    for (int i = 0; i < n; i++)
    {
        if (s[i] == '(')
            open++;
        else if (s[i] == ')')
            close++;
        else
            ques++;

        if (close > open and ques == 0)
            return false;
        if (close > open and ques > 0)
        {
            ques--;
            open++;
        }
    }
    if (ques > 0)
    {
        close += ques;
    }
    return open == close ? true : ques > 0 ? true : false;
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
        bool ans = solve();
        if (ans)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }

    return 0;
}