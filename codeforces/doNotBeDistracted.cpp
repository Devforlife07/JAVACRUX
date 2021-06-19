#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void solve()
{
    int n;
    cin >> n;
    string s;
    cin >> s;
    int i = 0;
    unordered_map<char, bool> m;
    while (i < n)
    {
        char cc = s[i];
        if (m[cc])
        {
            cout << "NO" << endl;
            return;
        }
        m[cc] = true;
        while (i < n and s[i] == cc)
        {
            i++;
        }
    }
    cout << "YES" << endl;
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
        solve();
    }

    return 0;
}