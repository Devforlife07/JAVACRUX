#include <bits/stdc++.h>
#define ll long long
using namespace std;
void solve()
{
    int n;
    cin >> n;
    vector<ll> a;
    ll temp;
    int i = 0;
    int flag = 0;
    while (i < n)
    {
        cin >> temp;
        if (temp > 1)
        {
            flag = 1;
        }
        a.push_back(temp);
        i++;
    }
    if (flag == 0)
    {
        if (n & 1)
            cout << "First" << '\n';
        else
            cout << "Second" << '\n';
        return;
    }
    int curr = 0;
    for (int i = 0; i < n; i++)
    {

        if (a[i] == 0)
        {
            if (curr)
            {
                cout << "First" << '\n';
            }
            else
                cout << "Second" << '\n';
            return;
        }
        else if (a[i] > 1)
        {
            // cout << "Curr" << curr << '\n';
            if (curr)
            {
                cout << "Second" << '\n';
            }
            else
                cout << "First" << '\n';
            return;
        }
        else
        {
            curr = (curr ^ 1);
        }
    }
    if (curr)
    {
        cout << "Second" << '\n';
    }
    else
        cout << "First" << '\n';
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