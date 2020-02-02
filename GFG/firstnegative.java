/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int k = sc.nextInt();
	  int[] a = new int[n];
	  for(int i =0;i<n;i++)
	  a[i]= sc.nextInt();
	  printans(a,k);
	}
	public static void printans(int[] a,int k){
	    for(int i =0;i<a.length-k+1;i++){
	        boolean flag = false;
	        for(int j = 0;j<k;j++){
	            if(a[i+j]<0){
	                System.out.print(a[i+j]+" ");
	                flag = true;
	                break;
	            }
	        }
	        if(!flag)
	        System.out.println(0+" ");
	    }
	}
}
