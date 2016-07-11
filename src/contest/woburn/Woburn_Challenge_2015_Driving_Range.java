package contest.woburn;

import java.util.*;
import java.io.*;

public class Woburn_Challenge_2015_Driving_Range {

	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	static int N, cntR, cntC, maxR, maxC;
	
	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		//br = new BufferedReader(new FileReader("in.txt"));
		//out = new PrintWriter(new FileWriter("out.txt"));

		N = readInt();
		
		for (int i = 0; i < N; i++) {
			char d = readCharacter();
			int p = readInt();
			
			if (d == 'R') {
				cntR++;
				maxR = Math.max(maxR, p);
			} else if (p > 1) {
				cntC++;
				maxC = Math.max(maxC, p);
			}
			
			out.println(i + 1 + cntR + cntC + Math.min(Math.max(maxC - cntR, 0) + Math.max(maxR - cntC - 1, 0),
													   Math.max(maxC - cntR - 1, 0) + Math.max(maxR - cntC, 0)));
		}
		out.close();
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

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
