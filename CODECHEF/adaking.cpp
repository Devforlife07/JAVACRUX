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
        int i = 1, j = 1;
        int flag = 0;
        for (i = 1; i <= 8 && count < (64 - k); i++)
        {
            for (j = 1; j <= 8 && count < (64 - k); j++)
            {
                cout << "X";
                count++;
                if (j == 8)
                    cout << "\n";
                if (count == 64 - k)
                {
                    break;
                }
            }
            if (count == 64 - k)
            {
                break;
            }
        }
        cout << "O";
        // cout << "j" << j;
        count++;
        j++;
        if (j == 9)
        {
            // cout << '\n';
            j = 1;
            i++;
        }
        // cout << count << "i" << i << "j" << j << '\n';
        // cout << count << '\n';
        for (; i <= 8 && count <= 64; i++)
        {
            for (int t = (j + 1); t <= 8 && count <= 64; t++)
            {
                cout << ".";
                count++;
                // if (t == 8)
            }
            j = 0;
            cout << "\n";
        }
        // cout << '\n';
    }
    return 0;
}