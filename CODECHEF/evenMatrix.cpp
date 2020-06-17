#include <bits/stdc++.h>
using namespace std;
#define ll unsigned long long
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        int o = 1;
        int e = 2;
        int c = 1;
        int a[1000][1000];
        cin >> n;
        for (int i = 0; i < n; i++)
        {
            a[0][i] = c;
            c ^= 1;
        }
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = (a[i - 1][j] ^ 1);
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i][j])
                {
                    cout << o << " ";
                    o += 2;
                }
                else
                {
                    cout << e << " ";
                    e += 2;
                }
            }
            cout << "\n";
        }
    }

    return 0;
}