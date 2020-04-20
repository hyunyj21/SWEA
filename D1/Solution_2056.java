/*
 * [D1] 2056. 연월일 달력
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_2056 {
	static int[] calendar = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#"+t+" ");
			String num = in.readLine();
			String M = num.substring(4,6);
			String D = num.substring(6,8);
			int month = Integer.parseInt(M);
			int day = Integer.parseInt(D);
			
			if (month > 12 || month < 1) {
				sb.append("-1\n");
				continue;
			}
			
			if (day > calendar[month] || day < 1) sb.append("-1\n");
			else sb.append(num.substring(0,4)+"/"+M+"/"+D+"\n");
		}
		
		System.out.println(sb);
	}
}