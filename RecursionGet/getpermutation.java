
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
		String a = "abc";
		ArrayList <String> ans = getss(a);
		System.out.println(ans);
	}
	
	public static ArrayList <String> getss(String str){
	    if(str.length()==0)
	    {
	        ArrayList<String> bc = new ArrayList<String>();
	        bc.add("");
	        return bc;
	    }
	    char cc = str.charAt(0);
	    String ros = str.substring(1);
	    ArrayList <String> rr = getss(ros);
	    ArrayList <String> mr = new ArrayList <String>();
	    for(String s : rr){
	        for(int i =0;i<=s.length();i++){
	            String res = s.substring(0,i)+cc+s.substring(i);
	            System.out.println(res);
	            mr.add(res);
	        }
	    }
	    return mr;
	}
}
