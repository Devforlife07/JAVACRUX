#include<iostream>
#include<cstring>
#include<cstdio>
#include<iomanip>
using namespace std;
const int MAXN=1e6+10;
int last[MAXN],num;
int main()
{
    int n;
    cin>>n;
    long long nu=0;
    memset(last, 0, sizeof(last));
    for(int i=1;i<=n;i++) {
        scanf("%d", &num);
        nu+=1LL*(i-last[num])*(n-i+1);
        last[num]=i;
    }
    nu=nu*2-n;
    cout<<fixed<<nu*1.0/(n*1.0)/(n*1.0)<<endl;
    return 0;
}