#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    freopen("input2.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
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
        ll rem = n;
        i = 0;
        while (i < n && a[i] <= cure)
        {
            if (a[i] >= round((double)cure / 2))
            {
                break;
                curr = a[i];
            }
            i++;
        }
        // if (a[i] < curr)
        // {
        //     i++;
        // }
        ll count = 0;
        // cout << i << '\n';
        while (rem)
        {
            // cout << curr << '\n';
            count++;
            if (curr >= a[n - 1])
            {
                count += rem - 1;
                break;
            }
            else if (curr >= a[i])
            {
                rem--;
                curr = a[i] * 2;
                i++;
            }
            else
            {
                curr *= 2;
            }
        }
        cout << count << '\n';
    }

    return 0;
}