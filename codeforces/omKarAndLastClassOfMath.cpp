#include <bits/stdc++.h>
#define ll long long
using namespace std;
// const int size = ;
vector<ll> primes;
void fill()
{
    ll a[100009] = {0};
    for (ll i = 2; i <= 100000; i++)
    {
        if (a[i] == 0)
        {
            primes.push_back(i);
            for (ll j = i; j <= 100000; j += i)
            {
                a[j] = 1;
            }
        }
    }
}
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    fill();
    int t;
    cin >> t;
    while (t--)
    {
        ll n;
        cin >> n;
        if (binary_search(primes.begin(), primes.end(), n))
        {
            cout << 1 << " " << (ll)(n - 1) << '\n';
        }
        else if ((n % 2) == 0)
        {

            cout << (ll)(n / 2) << " " << (ll)(n / 2) << '\n';
        }
        else
        {
            int flag = 0;
            for (ll i = 2; i <= 100000; i++)
            {
                if (n % i == 0)
                {
                    flag = 1;
                    cout << (ll)(n / i) << " " << (ll)abs((n - (n / i))) << '\n';
                    break;
                }
            }
            if (!flag)
                cout << 1 << " " << (n - 1) << '\n';
        }
    }
    return 0;
}