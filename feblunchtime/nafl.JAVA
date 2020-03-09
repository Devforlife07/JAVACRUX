import java.util.*;
class nafl
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> ans = new ArrayList<>();

    static int count = 0;

    public static void cal(int[] a,int n, int k){
        int[] visited = new int[k+1];
          for(int i =0;i<k+1;i++)
          visited[i] =0;
        int lk = k;
      
     int i = 0;
     int cn = 0;
     int prev = 0;
     int length = 0;
     while(i<n){
        
      //  System.out.println("Test="+lk);
      // System.out.println("Test="+cn);
      // System.out.println("A="+a[i]);

          // System.out.println("Length="+length);
          // System.out.println("Count="+count);
         
         if(lk==0){
          // System.out.println("Length="+length);
          // System.out.println("i="+((i+1)));
          if(length>count){
          count = length;}
          length =0;
          i = prev;
          // for(int j =0;j<lk;j++)
          // visited[j] =0;
          lk = k-1;

         }
       else if(cn!= a[i]&&lk>0&&visited[a[i]]!=1){
        System.out.println("*********");

         for(int l : visited){
           System.out.println("VIsited:"+l);
            
          }
          System.out.println("*********");

        //  System.out.println("Yeh Chala");
          // System.out.println("i="+((i+1)));

           visited[a[i]]= 1;
           cn = a[i];
           prev = i;
           lk--;
           i++;
           length++;
                  }
       else if(cn!=a[i]&&visited[a[i]]==1){
           length++;
           prev = a[i];
           cn =a[i];
           i++;
       }
       else{
         length++;
         i++;
       }
   
     }
    //  count = length;
     System.out.println(count);
    
    }
    public static void main(String[] args) {
        int  n = sc.nextInt();
        int k = sc.nextInt();
        // visited = new int[k];
        int[] a = new int [n];
        
        int i = 0;
        while(i<n){
            a[i++] = sc.nextInt();
        }
        cal(a,n,k);
        // System.out.println(count);
    }
}