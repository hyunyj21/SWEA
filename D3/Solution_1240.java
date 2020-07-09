/*
 * [D3] 1240. [S/W 문제해결 응용] 1일차 - 단순 2진 암호코드
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1240 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			boolean check = false;
			for (int i = 0; i < N; i++) {
				String code = in.readLine();
				
				if (check) continue;
			}
			
		}
	}
}