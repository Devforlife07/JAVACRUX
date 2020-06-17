#include <bits/stdc++.h>
using namespace std;
string s;
string s2;
int compute(int i, int j)
{
    if (i == (s.length()) || j == s2.length())
        return 0;
    else if (s[i] == s[j])
        return 1 + compute(i + 1, j + 1);
    else
        return max(compute(i + 1, j), compute(i, j + 1));
}

int main()
{
    getline(cin, s);
    getline(cin, s2);
    // cout << s << " " << s2 << "\n";
    cout << compute(0, 0) << "\n";
}
