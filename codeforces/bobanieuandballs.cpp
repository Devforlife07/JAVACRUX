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
        int r, g, b, w;
        cin >> r >> g >> b >> w;
        int odd = (r % 2) + (g % 2) + (b % 2) + (w % 2);
        if (odd <= 1)
            cout
                << "Yes" << '\n';
        else if (r > 0 and g > 0 and b > 0 and (((r - 1) % 2) + ((g - 1) % 2) + ((b - 1) % 2) + (w + 1) % 2) <= 1)
            cout
                << "Yes" << '\n';
        else
        {
            cout << "No" << '\n';
        }
    }

    return 0;
}