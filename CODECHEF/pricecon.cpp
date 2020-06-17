#include <bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin >> t;
    int a[100000];
    while (t--)
    {
        int n, k;
        cin >> n >> k;
        int i = 0;
        while (i < n)
        {
            cin >> a[i];
            i++;
        }
        int loss = 0;
        i = 0;
        while (i < n)
        {
            if (a[i] > k)
            {
                loss += a[i] - k;
            }
            i++;
        }
        cout << loss << "\n";
    }
}