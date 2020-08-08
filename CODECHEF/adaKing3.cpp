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
        int k;
        cin >> k;
        int count = 0;
        cout << 'O';
        int dot = k - 1;
        int reserve = dot;
        int i = 1, j = 2;
        for (i = 1; i <= 8 && dot > 0; i++)
        {
            for (j = i == 1 ? 2 : 1; j <= 8 && dot > 0; j++)
            {
                cout << ".";
                dot--;
            }
            if (dot == 0)
                break;
            cout << '\n';
        }
        int x = 64 - reserve - 1;
        // cout << x << '\n';
        for (; i <= 8 && x > 0; i++)
        {
            for (; j <= 8 && x > 0; j++)
            {
                cout << 'X';
                x--;
            }
            j = 1;
            cout << '\n';
        }
    }
    return 0;
}