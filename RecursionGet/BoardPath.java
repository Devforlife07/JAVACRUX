/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class run {
	public static void main(String[] args) throws java.lang.Exception {

		// your code goes here
		System.out.println(dazeboard(0, 10));
	}

	public static ArrayList<String> dazeboard(int curr, int end) {
		if (curr == end) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add("");
			return bc;
		}
		if (curr > end) {
			return new ArrayList<String>();
		}
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = dazeboard(dice + curr, end);
			for (String rrs : rr) {
				String ans = dice + rrs;

				mr.add(ans);
			}
		}
		return mr;
	}
}
