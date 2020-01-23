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
		int n;
		n = sc.nextInt();
		for(int j =0;j<n;j++){
		String str = sc.next();
		ArrayList <String> ans = new ArrayList<String>();
		ans = print(str);
		Collections.sort(ans);
		for(int i =0;i<ans.size();i++){
		System.out.println(ans.get(i));
		}}
	}
	public static ArrayList <String> print (String str){
	    if(str.length()==0)
	    {
	        ArrayList <String> ans = new ArrayList <String>();
	        ans.add("");
	        return ans;
	    }
	    char cc = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList <String> recur = print(ros);
	   // recur = print(ros);
	    ArrayList <String> myresult = new ArrayList <String>();
	    for(int i = 0;i<recur.size();i++){
	        myresult.add(recur.get(i));
	        myresult.add(cc+recur.get(i));
	    }
	    return myresult;
	}
}
