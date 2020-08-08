#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    int temp;
    int a[1000000];
    while (t--)
    {
        int n;
        cin >> n;
        int i = 0;
        while (i < n)
        {
            cin >> temp;
            a[i] = temp;
            i++;
        }
        int ans = n - 1;
        while (ans > 0)
        {
            if (a[ans - 1] > a[ans])
            {
                ans--;
            }
            else
                break;
        }
        while (ans > 0)
        {
            if (a[ans - 1] < a[ans])
            {
                ans--;
            }
            else
                break;
        }
        cout << ans << '\n';
    }

    return 0;
}