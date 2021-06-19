#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
int countright(char *a, int mid, int count, int n)
{
    // cout << "Count " << count << endl;
    int i = mid + 1;
    int ans = 0;
    int x = 0;
    while (count > 0 and i < n)
    {
        if (a[i] == '*')
        {
            ans += i - mid - 1 - x;
            count--;
            x++;
        }
        i++;
    }

    return ans;
}
int countleft(char *a, int mid, int count)
{
    int i = mid - 1;
    int ans = 0;
    int x = 0;
    while (count > 0 and i >= 0)
    {
        if (a[i] == '*')
        {
            // cout << "MID " << mid << " I " << i << " X " << x << endl;
            ans += mid - i - 1 - x;
            count--;
            // cout << "ANS " << ans << endl;
            x++;
        }
        i--;
    }

    return ans;
}
void solve()
{
    int n;
    cin >> n;
    char *a = new char[n];
    int i = 0;
    int sheep = 0;
    vector<int> si;
    while (i < n)
    {
        cin >> a[i];
        switch (a[i])
        {
        case '*':
            sheep++;
            si.push_back(i);
            break;
        }
        i++;
    }
    if (sheep <= 1)
    {
        cout << 0 << endl;
        return;
    }
    int midsheep = (sheep + 1) / 2;
    int indexofmid;
    int index = midsheep;
    i = 0;
    while (index > 0)
    {
        if (a[i] == '*')
        {
            index--;
        }
        if (!index)
            break;
        i++;
    }
    indexofmid = i;
    int leftsheep = lower_bound(si.begin(), si.end(), indexofmid) - si.begin();
    int rightsheep = sheep > 0 ? sheep - 1 - leftsheep : 0;
    // cout << rightsheep << endl;
    int left = countleft(a, indexofmid, leftsheep);
    int right = countright(a, indexofmid, rightsheep, n);
    // cout << left << endl;
    cout << left + right << endl;
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
    {
        solve();
    }

    return 0;
}