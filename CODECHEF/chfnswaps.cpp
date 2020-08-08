#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input2.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        map<ll, ll> total;
        map<ll, ll> a;
        map<ll, ll> b;
        int n;
        cin >> n;
        int i = 1;
        ll temp;
        while (i <= n)
        {
            cin >> temp;
            total[temp]++;
            a[temp]++;
            i++;
        }
        i = 1;
        while (i <= n)
        {
            cin >> temp;
            total[temp]++;
            b[temp]++;
            i++;
        }

        ll count = 0;
        int flag = 0;
        ll tempa, tempb;
        for (auto it : total)
        {
            tempa = 0;
            tempb = 0;
            if ((it.second % 2))
            {
                flag = 1;
                break;
            }
            tempa = a[it.first];
            // cout << "first" << it.first << '\n';
            // cout << "tempa=" << tempa << '\n';
            tempb = b[it.first];
            // cout << "tempb=" << tempb << '\n';
            if (tempa - tempb)
                count += abs(tempa - tempb);
        }
        count /= 2;
        ll res = count;
        int j = 0;
        // cout << "count= " << count << '\n';
        ll ans2 = 0;
        for (auto it : total)
        {
            // cout << res << '\n';
            if (res <= count / 2)
            {
                break;
            }
            ll t1 = a[it.first];
            ll t2 = b[it.first];
            ll diff = abs(t1 - t2);
            if (a[it.first] != b[it.first])
            {
                // unique--;
                // cout << "Diff" << diff << '\n';
                // cout << j << '\n';
                ans2 += it.first * (diff / 2);
                res -= diff / 2;
            }
        }
        ll first = 0;
        if (flag == 1)
        {
            cout << -1 << '\n';
        }
        else
        {
            if (count == 0)
                cout << 0 << '\n';
            else
            {

                ll ans1 = 0;
                cout << count << '\n';
                ll first = total.begin()->first;
                for (auto it : total)
                {

                    // if (it.first > 2 * first || res > total.size() / 2)
                    //     break;
                    // if (it.first > 2 * first || res <= count)
                    // break;
                    if (it.first > 2 * first || count <= 0)
                        break;
                    ll ina = a[it.first];
                    ll inb = b[it.first];
                    ans1 += (it.first * abs(ina - inb) / 2);
                    count -= abs(ina - inb);
                }
                cout << "Ans1==" << ans1 << '\n';
                cout << "Count" << count << '\n';
                ans1 += count * first;
                cout << "ans1 " << ans1 << "ans2 " << ans2 << '\n';
                cout << min(ans1, ans2) << '\n';
            }
            total.clear();
            a.clear();
            b.clear();
        }
    }
}