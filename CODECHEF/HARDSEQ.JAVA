import java.util.*;
class hard{
    static int[] a = new int[129];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
        int[] check = new int[129];
        for(int i =0;i<129;i++){
        check[i]=-1;
        }
        a[0]=0;
        
        for(int i =1;i<129;i++){
            int x = a[i-1];
            if(check[x]==-1){
                a[i]=0;
                check[x]=0;
                continue;
            }
            else{
                int k = i-2;
                int c =1;
                while(k>0){
                    if(a[k]==a[i-1]){   
                    break;}
                
                else
                {
                    k--;
                    c++;
                }
            }
            a[i]=c;
        }}
        
        int n = sc.nextInt();
        int ans = a[n-1];
        int count =0;
        for(int i=0;i<=n-1;i++)
    {
        if(a[i]==ans)
        count++;
    }
    System.out.println(count);
 t--;
}
    }
}