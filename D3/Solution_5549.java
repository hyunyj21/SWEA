/*
 * [D3] 5549. 홀수일까 짝수일까
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_5549 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String num = in.readLine();
			
			String ans;
			if ((num.charAt(num.length()-1)-'0') % 2 == 1) ans = "Odd";
			else ans = "Even";
			
			System.out.println("#"+t+" "+ans);
		}
	}
}