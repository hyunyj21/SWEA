/*
 * [D1] 2072. 홀수만 더하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2072 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int ans = 0;
			
			for (int i = 0; i < 10; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp % 2 == 1) ans += tmp;
			}
			
			sb.append("#"+t+" "+ans+"\n");
		}
		
		System.out.println(sb);
	}
}