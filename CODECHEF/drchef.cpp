#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    // cout << "yes" << '\n';
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {

        int n;
        cin >> n;
        ll a[100012];
        int i = 0;
        ll cure;
        ll temp;
        cin >> cure;
        while (i < n)
        {
            cin >> temp;
            a[i] = temp;
            i++;
        }
        ll curr = cure;
        sort(a, a + n);
        int rem = n;
        ll count = 0;
        ll id = 0;
        i = 0;
        int flag = 0;
        // while (i < n)
        // {

        //     // if (a[i] >= (cure / 2) && (a[i] % 2 != 0))
        //     if (a[i] >= (cure / 2) && a[i] <= cure / 2)
        //     {
        //         curr = a[i];
        //         flag = 1;
        //         // rem--;
        //         break;
        //     }
        //     if (flag = 1)
        //         break;
        //     i++;
        // }
        while (i < n)
        {

            if (a[i] >= round((double)cure / 2))
            {
                flag = 1;
                break;
            }
            if (flag)
                break;
            i++;
        }
        id = i;
        // cout << id << endl;
        while (rem)
        {
            count++;

            cout << "-------" << '\n';
            cout << "id" << id << '\n';
            cout << "count" << count << '\n';
            cout << curr << '\n';
            cout << "rem" << rem << '\n';

            if (curr >= a[n - 1])
            {
                count += rem - 1;
                break;
            }
            else if (curr > round((double)a[n - 1] / 2))
            {

                if (a[id] <= curr)
                    rem--;
                count += rem;
                break;
            }
            else if (curr >= a[id])
            {
                // cout << "id" << id << '\n';
                rem--;
                // cout << "extra rem" << rem << '\n';
                // cout << "extra count" << count << '\n';
                curr = a[id] * 2;
                id++;
            }
            else
            {
                curr *= 2;
                // count++;
            }
        }
        cout << count << '\n';
    }

    return 0;
}