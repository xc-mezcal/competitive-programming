package ccc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC_2002_J2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static StringTokenizer st;

	public static void main (String[] args) throws IOException {
		String s = "";
		String cons = "bcdfghjklmnpqrstvwxyz";
		while (!(s = readLine()).equals("quit!")) {
			int l = s.length();
			if (l > 4 && s.substring(l - 2).equals("or")
					&& cons.indexOf(s.charAt(l - 3)) != -1)
				System.out.println(s.substring(0, l - 2) + "our");
			else
				System.out.println(s);
		}
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
