#include <bits/stdc++.h>
using namespace std;
#define ll long long
ll kadane(int a[], int size)
{
    int max_so_far = INT_MIN, max_ending_here = 0;

    for (int i = 0; i < size; i++)
    {
        max_ending_here = max_ending_here + a[i];
        if (max_so_far < max_ending_here)
            max_so_far = max_ending_here;

        if (max_ending_here < 0)
            max_ending_here = 0;
    }
    return max_so_far;
}
int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int *a = new int[n];
        int i = 0;
        while (i < n)
        {
            cin >> a[i];
            i++;
        }
        ll ans1 = kadane(a, n);
        sort(a, a + n, greater<int>());
        ll ans2 = 0l;
        i = 0;
        int flag = 0;
        while (a[i] > 0 && i < n)
        {
            flag = 1;
            ans2 += a[i];
            i++;
        }

        if (flag == 0)
        {
            ans2 = a[0];
        }
        cout << ans1 << " " << ans2 << "\n";
    }

    return 0;
}
