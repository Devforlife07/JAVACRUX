#include <bits/stdc++.h>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    int a[10000];
    while (t--)
    {
        int n;
        cin >> n;
        int i = 0;
        int bal = 0;
        while (i < n)
        {
            cin >> a[i];
            i++;
        }
        int j = 0;
        for (j = 0; i < n; i++)
        {
            int curr = a[i];
            if (a[i] == 5)
            {
                bal++;
            }
            else
            {
                if (bal == 0)
                    break;
                else if (a[i] == 10)
                    bal--;
                else
                    bal -= 2;
            }
            cout << j << "\n";
        }
    }

    return 0;
}