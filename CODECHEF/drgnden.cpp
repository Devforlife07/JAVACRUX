#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n, q, flag;
    cin >> n >> q;
    ll a[1000009] = {0};
    ll taste[1000009] = {0};
    int i = 1;
    ll temp;
    while (i <= n)
    {
        cin >> temp;
        a[i] = temp;
        i++;
    }
    i = 1;
    while (i <= n)
    {
        cin >> temp;
        taste[i] = temp;
        i++;
    }
    ll j = 1;
    for (j = 1; j <= q; j++)
    {
        flag = 0;
        int type, b;
        cin >> type >> b;
        ll k;
        int flag = 0;
        cin >> k;
        ll count = 0;
        if (type == 1)
        {
            taste[b] = k;
            flag = 1;
        }
        else
        {
            // cout<<"k "<<k<<" b"<<b<<'\n';
            if (b > k)
            {
                count += taste[b] + taste[k];

                for (ll x = b - 1; x > k; x--)
                {
                    // cout<<"x "<<x<<'\n';
                    if (a[x] > a[b])
                    {
                        count = -1;
                        // cout << -1 << '\n';
                        // flag = 1;
                        break;
                    }
                    if (a[x - 1] < a[x])
                    {
                        // cout << "taste" << taste[x] << '\n';
                        count += taste[x];
                    }
                }
                // count+=taste[k];
            }
            else if (b < k)
            {
                count += taste[b] + taste[k];

                for (ll x = b + 1; x < k; x++)
                {
                    // cout<<"x "<<x<<'\n';
                    if (a[x] > a[b])
                    {
                        // cout << -1 << '\n';
                        // flag = 1;
                        count = -1;
                        break;
                    }
                    if (a[x - 1] < a[x])
                    {
                        // cout << "taste" << taste[x] << '\n';
                        count += taste[x];
                    }
                }
                // count+=taste[k];
            }
            else
            {
                count = taste[k];
            }
        }
        if (flag == 0)
            cout << count << '\n';
    }

    return 0;
}