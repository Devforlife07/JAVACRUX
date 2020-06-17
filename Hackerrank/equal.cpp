#include <bits/stdc++.h>
#define ll long long
using namespace std;
int opNo(int n)
{
    int res = 0;
    res = n / 5;
    n %= 5;
    res += n / 2;
    n %= 2;
    res += n;
    return res;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int a[1000000];
        int i = 0;
        int num;
        int min = INT32_MAX;
        while (i < n)
        {
            cin >> num;
            a[i] = num;
            min = num < min ? num : min;
            i++;
        }
        int Answer = INT_MAX;
        for (int i = 0; i < 4; i++)
        {
            int currAns = 0;
            for (int j = 0; j < n; j++)
            {
                currAns = opNo(a[j] - min + i);
            }
            if (currAns < Answer)
            {
                Answer = currAns;
                        }
        }
        cout << Answer << '\n';
    }

    return 0;
}