#include <bits/stdc++.h>
#define ll long long
using namespace std;
bool palindrome(string s, int k, int n)
{
    string s1 = s.substr(0, k);
    int len = n - k;
    string s2 = s.substr(len, n);
    reverse(s2.begin(), s2.end());
    return s1.compare(s2) == 0 ? true : false;
}
void solve()
{
    int n, k;
    cin >> n >> k;
    string s;
    cin >> s;
    if (!k)
    {
        cout << "YES" << endl;
        return;
    }
    else if (2 * k == n)
    {
        cout << "NO" << endl;
        return;
    }
    else
    {
        bool ans = palindrome(s, k, n);
        if (ans)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
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