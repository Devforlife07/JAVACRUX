#include <bits/stdc++.h>
#define ll long long
using namespace std;
const string m = "abacaba";
bool contains(string s)
{
    int count = 0;
    for (int i = 0; i <= s.length() - m.length(); i++)
    {
        int j;
        for (j = 0; j < m.length(); j++)
        {
            if (s[i + j] != m[j])
                break;
        }
        if (j == m.length())
        {
            count++;
        }
    }
    return count == 1;
}
void display(string s)
{
    for (char ch : s)
    {
        if (ch == '?')
            cout << 'd';
        else
            cout << ch;
    }
    cout << '\n';
}
void solve()
{

    int n;
    cin >> n;
    string s;
    cin >> s;
    if (contains(s))
    {
        cout << "YES" << '\n';
        display(s);
        return;
    }
    else
    {
        for (int i = 0; i <= n - 7; i++)
        {
            string str = s;
            bool flag = true;
            for (int j = 0; j < 7; j++)
            {
                if (str[i + j] != '?' && str[i + j] != m[j])
                {
                    flag = false;
                    break;
                }
                str[i + j] = m[j];
            }
            if (flag && contains(str))
            {
                cout << "Yes" << '\n';
                display(str);
                return;
            }
        }
        cout << "No" << '\n';
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }

    return 0;
}