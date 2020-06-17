#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin >> t;
    while (t)
    {
        int n, x;
        cin >> n >> x;
        int i = 1;
        int odd = 0;
        int even = 0;
        int num = 0;
        while (i <= n)
        {
            cin >> num;
            if (num & 1)
            {
                if (odd < x)
                    odd++;
            }
            else
                even++;
            i++;
        }

        if (odd & 1)
        {
            cout << "Yes"
                 << "\n";
        }
        else
        {
            odd -= 1;
            if (even >= (x - odd) && (odd > 0))
            {
                cout << "Yes"
                     << "\n";
            }
            else
                cout << "No"
                     << "\n";
        }

        t--;
    }

    return 0;
}