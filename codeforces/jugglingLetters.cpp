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
        map<char, int> obj;
        int n;
        cin >> n;
        int i = 0;
        string temp;
        while (i < n)
        {
            cin >> temp;
            for (char ch : temp)
            {
                obj[ch]++;
            }
            i++;
        }
        int flag = 0;
        for (auto x : obj)
        {
            if (x.second % n != 0)
            {
                flag = 1;
                cout << "NO" << '\n';
                break;
            }
        }
        if (flag == 0)
            cout << "YES" << '\n';
    }

    return 0;
}