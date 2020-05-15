/*
 * [D3] 7584. 자가 복제 문자열
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_7584 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			long K = Long.parseLong(in.readLine())-1;
			
			while (K%2 == 1)
				K = (K-1)/2;
			
			if (K%4 == 0) System.out.println("#"+t+" "+0);
			else System.out.println("#"+t+" "+1);
		}
	}
}