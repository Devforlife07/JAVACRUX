#include <bits/stdc++.h>
using namespace std;
#define ll long long
int prefix[40001];
void fillPrefix(ll a, ll b)
{
    int count = 0;
    prefix[0] = 0;
    for (int i = 1; i <= a * b; i++)
    {
        if (((i % a) % b) != ((i % b) % a))
            count++;
        prefix[i] = count;
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        ll a, b, q;
        cin >> a >> b >> q;
        fillPrefix(a, b);
        for (int i = 1; i <= q; i++)
        {
            ll l, r;
            cin >> l >> r;
            ll rans = (prefix[a * b]) * (r / (a * b)) + prefix[(r % (a * b))];
            ll lans = (prefix[a * b]) * ((l - 1) / (a * b)) + prefix[((l - 1) % (a * b))];
            cout << rans - lans << " ";
        }
        cout << '\n';
    }
}