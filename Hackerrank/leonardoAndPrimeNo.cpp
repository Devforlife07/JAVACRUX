#include <bits/stdc++.h>
#define ll long long
using namespace std;
vector<int> primes(1001);
vector<int> prime_no;
void calPrimes()
{
    primes[0] = 1;
    primes[1] = 1;
    for (int i = 4; i <= 10000; i += 2)
    {
        primes[i] = 1;
    }
    for (int i = 2; i * i <= 10000; i++)
    {

        if (!primes[i])
        {
            prime_no.push_back(i);
            for (int j = i * i; j <= 10000; j += i)
            {
                primes[j] = 1;
            }
        }
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int q;
    calPrimes();
    // cout << res << '\n';
    cin >> q;
    while (q--)
    {
        ll n;
        cin >> n;
        int count = 0;
        ll res = prime_no[0];
        int i = 1;
        while (res <= n)
        {
            res *= prime_no[i];
            i++;
            count++;
        }
        cout << count << '\n';
    }
    return 0;
}