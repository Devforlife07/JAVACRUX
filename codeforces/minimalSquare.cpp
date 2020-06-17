#include <iostream>
using namespace std;
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie();
    int t;
    cin >> t;
    while (t)
    {
        int a, b;
        cin >> a >> b;
        int min = a > b ? b : a;
        int max = a > b ? a : b;
        if ((2 * min) >= max)
        {
            min = 2 * min;
            cout << min * min << "\n";
        }
        else
        {
            // max = 2 * max;
            cout << max * max << "\n";
        }

        t--;
    }
    /* code */
    return 0;
}
