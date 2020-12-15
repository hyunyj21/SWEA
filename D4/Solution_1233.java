/*
 * [D4] 1233. [S/W 문제해결 기본] 9일차 - 사칙연산 유효성 검사
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1233 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			int N = Integer.parseInt(in.readLine());
			boolean flag = false;
			
			for (int i = 0; i < N; i++) {
				if (flag) {
					in.readLine();
					continue;
				}
				
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				st.nextToken();
				int num = st.nextToken().charAt(0) - '0';
				
				if (st.hasMoreTokens() && num > 0) {
					flag = true;
					continue;
				}
				
				if (!st.hasMoreTokens() && num < 0) flag = true;
			}
			
			if (flag) System.out.println("#"+t+" 0");
			else System.out.println("#"+t+" 1");
		}
	}
}