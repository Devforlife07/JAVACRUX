#include <iostream>
#include <math.h>
#include <algorithm>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    while (t--)
    {
        int n, m, k;
        cin >> n >> m >> k;
        int per_person = n / k;
        if (!m)
        {
            cout << 0 << '\n';
        }
        else if (m <= per_person)
        {
            cout << m << "\n";
        }
        else
        {
            int rem = m - per_person;
            if (rem < k - 1)
            {
                cout << per_person - 1 << '\n';
            }
            else
            {

                cout << per_person - ceil((double)rem / (k - 1)) << '\n';
            }
        }
    }
}