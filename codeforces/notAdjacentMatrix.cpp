#include <bits/stdc++.h>
#define ll long long
using namespace std;
#define MAX 100005
void print(vector<vector<int>> &a, int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cout << a[i][j] << " ";
        }
        cout << endl;
    }
}
void printOdd(vector<vector<int>> &a, int n, int &counter)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i & 1 ? 0 : 1; j < n; j += 2)
        {
            a[i][j] = counter;
            counter++;
        }
    }
}
void printEven(vector<vector<int>> &a, int n, int &counter)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = i & 1 ? 1 : 0; j < n; j += 2)
        {
            a[i][j] = counter;
            counter++;
        }
    }
}
void solve()
{
    int n;
    cin >> n;
    if (n == 1)
    {
        cout << 1 << endl;
        return;
    }
    if (n == 2)
    {
        cout << -1 << endl;
        return;
    }
    int counter = 1;
    vector<vector<int>> a(n, vector<int>(n, 0));
    printEven(a, n, counter);
    printOdd(a, n, counter);
    print(a, n);
}

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
        solve();
    }

    return 0;
}