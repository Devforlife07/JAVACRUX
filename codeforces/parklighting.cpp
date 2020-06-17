#include<bits/stdc++.h>
using namespace std;
int main(){
 ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
 int t;
 cin>>t;
 
 while(t--) {
   int a,b;
   cin>>a>>b;
   if(b&1){
       if(a&1){
          int ans = (a/2)*b;
          ans+= b/2+1;
          cout<<ans<<"\n";
       }
       else{
           cout<<((a/2)*b)<<"\n";
       }

   }
   else{
           cout<<(a*(b/2))<<"\n"; 
   }
 }
 
}