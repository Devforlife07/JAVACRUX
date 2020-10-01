#include <bits/stdc++.h>
#define ll long long
using namespace std;
bool isPossible(ll count, ll paratha, ll cooks, ll *a)
{
    for (int i = 0; i < cooks; i++)
    {
        ll tm = 0;
        int cp = 1;
        while ((tm + (cp * a[i]) <= count) and paratha > 0)
        {
            paratha--;
            tm += cp * a[i];
            cp++;
        }
        if (paratha == 0)
            return true;
    }

    return false;
}
int main()
{
    ll t;
    cin >> t;
    while (t--)
    {
        ll paratha;
        ll cooks;
        cin >> paratha >> cooks;
        ll a[cooks];
        int i = 0;
        ll temp;
        while (i < cooks)
        {
            cin >> temp;
            a[i] = temp;
            i++;
        }
        // sort(a, a + cooks);

        int s = 1;
        int e = INT32_MAX;
        ll ans = 0;
        while (s <= e)
        {
            ll mid = (s + e) / 2;
            if (isPossible(mid, paratha, cooks, a))
            {

                ans = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }
        }
        cout << ans << '\n';
    }

    return 0;
}