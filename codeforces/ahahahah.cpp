#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        map<int, int> a;
        int i = 1;
        int temp;
        while (i <= n)
        {
            cin >> temp;
            a[temp]++;
            i++;
        }
        if (a[0] >= a[1])
        {
            cout << n / 2 << endl;
            for (int i = 0; i < (n / 2); i++)
            {
                cout << 0 << " ";
            }
        }
        else
        {
            int count = 0;
            if ((n / 2) % 2)
            {
                count = (n / 2) + 1;
            }
            else
                count = n / 2;
            cout << count << endl;
            for (int i = 1; i <= count; i++)
                cout << 1 << " ";
        }
        cout << endl;
    }

    return 0;
}