/*
 * [D1] 2068. 최대수 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2068 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int ans = Integer.MIN_VALUE;
			
			for (int i = 0; i < 10; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (ans < tmp) ans = tmp;
			}
			
			sb.append("#"+t+" "+ans+"\n");
		}
		
		System.out.println(sb);
	}
}