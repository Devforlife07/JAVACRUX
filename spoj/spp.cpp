#include <bits/stdc++.h>
using namespace std;
#define ll long long
vector<ll> a, b, c;
int k;

ll compute(ll m, ll n, ll p)
{
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {

        cin >> k;
        int i = 0;
        ll num = 0l;
        while (i < k)
        {
            cin >> num;
            b.push_back(num);
            i++;
        }
        i = 0;
        while (i < k)
        {
            cin >> num;
            c.push_back(num);
            i++;
        }
        ll m, n, p;
        cin >> m >> n >> p;
        cout << compute(m, n, p) << "\n";
        b.clear();
        c.clear();
    }
}