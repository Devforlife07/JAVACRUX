#include <bits/stdc++.h>
#define ll long long
using namespace std;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    int t;
    cin >> t;
    int a[1000];
    while (t--)
    {
        // int max = INT_MIN;
        int n;
        cin >> n;
        int i = 0;
        int temp;
        while (i < n)
        {
            cin >> temp;
            a[i] = temp;
            i++;
            // max = temp > max ? temp : max;
        }
        string str(200, 'a');
        cout << str << '\n';
        for (int i = 0; i < n; i++)
        {
            int index = a[i];
            str[index] = str[index] == 'a' ? 'b' : 'a';
            cout << str << '\n';
        }

        // cout << '\n';
    }

    return 0;
}
// if (zero < 26)
// {
//     cout << (char)(98 + zero);
// }
// else
// {
//     cout << (char)(98 + (zero % 26));
//     cout << (char)(98 + (zero % 26));
// }