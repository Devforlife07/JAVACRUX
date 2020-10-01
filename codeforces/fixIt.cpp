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
    cin>>t;
    while (t--) {
        char ch[1001][1001];
        int n, m;
        char a;
        cin>>n>>m;
        for (int i = 1;i<=n;i++) {
            for (int j=1;j<=m;j++) {
                if (i==n and j==m) {

                    ch[i][j]='C';
                }
                else {
                    cin>>a;
                    ch[i][j]=a;
                }
            }
        }
        cin.get();
        int count = 0;
        for (int i = 1;i<m;i++) {
            if (ch[1][i]=='D')
                count++;
        }
        for (int i = 1;i<n;i++) {
            if (ch[i][m]=='R') {
                count++;
            }
        }
        std::cout<<count<<'\n';
    }

    return 0;
}