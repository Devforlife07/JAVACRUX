#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
int findMex(map<ll, ll> &a, int n, int max)
{
    int i;
    bool flag = false;
    for (i = 0; i <= MAX; i++)
    {
        if (!a.count(i))
        {
            flag = true;
        }
        if (flag)
            break;
    }
    return i;
}
void solve()
{
    int n, k;
    cin >> n >> k;
    // int a[100005] = {0};
    map<ll, ll> a;
    int i = 1;
    int x;
    int max = 0, mex;
    while (i <= n)
    {
        cin >> x;
        a[x]++;
        max = x > max ? x : max;
        i++;
    }
    mex = findMex(a, n, max);
    if (!k)
    {
        cout << n << endl;
        return;
    }
    if (mex > max)
    {
        cout << n + k << endl;
    }
    else
    {
        int curr = ceil((double)(((double)mex + (double)max) / (double)2));
        if (a[curr])
        {
            cout << n << endl;
        }
        else
        {
            cout << n + 1 << endl;
        }
    }
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