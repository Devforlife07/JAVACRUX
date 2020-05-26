#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n1, n2, n3;
        cin >> n1 >> n2 >> n3;
        if (n3 && !n1 && !n2)
        {
            for (int i = 1; i <= n3 + 1; i++)
            {
                cout << 1;
            }
        }
        else if (n1 && !n2 && !n3)
        {
            for (int i = 1; i <= n1 + 1; i++)
            {
                cout << "0";
            }
        }
        else
        {
            for (int i = 1; i <= n1 + 1; i++)
                cout << 0;
            for (int i = 1; i <= n3 + 1; i++)
            {

                cout << 1;
            }

            n2--;

            for (int i = 1; i <= n2; i++)
            {
                if (i & 1)
                    cout << 0;
                else
                    cout << 1;
            }
        }
        cout << "\n";
    }
    return 0;
}