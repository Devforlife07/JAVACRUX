#include <bits/stdc++.h>
using namespace std;
bitset<3005> b;
vector<int> primes;
void calPrimes()
{
    b.set();
    b[0] = b[1] = 0;
    for (int i = 2; i <= 3000; i++)
    {

        if (b[i])
        {
            primes.push_back(i);
            for (int j = i * i; j <= 3000; j += i)
            {
                b[j] = 0;
            }
        }
    }
}
int main()
{
    int n;
    cin >> n;
    calPrimes();
    // for (auto x : primes)
    //     cout << x << ' ';
    int count = 0;
    for (int i = 2; i <= n; i++)
    {
        int c = 0;
        for (auto x : primes)
        {
            if (i % x == 0)
                c++;
        }
        if (c == 2)
            count++;
    }
    cout << count << "\n";
    return 1;
}
