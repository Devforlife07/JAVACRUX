#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
int a[10] = {0};
int numDigits(int number)
{
    int digits = 0;
    if (number < 0)
        digits = 1; // remove this line if '-' counts as a digit
    while (number)
    {
        number /= 10;
        digits++;
    }
    return digits;
}
void solve()
{
    int n;
    cin >> n;
    if (n < 10)
    {
        cout << n << endl;
        return;
    }
    int digits = numDigits(n);
    int ans = a[digits - 1];
    digits -= 1;
    auto div = pow(10, digits);
    int num = n / div;
    ans += (num - 1);
    int check = 0;
    while (div)
    {
        check += num * div;
        div /= 10;
    }
    ans = n < check ? ans : ans + 1;
    cout << ans << endl;
}
int main()
{
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    a[0] = 0;
    for (int i = 1; i <= 9; i++)
        a[i] = a[i - 1] + 9;
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }

    return 0;
}