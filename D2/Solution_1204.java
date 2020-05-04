/*
 * [D2] 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1204 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			in.readLine(); //테스트케이스 번호
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			int[] cnt = new int[101];
			for (int i = 0; i < 1000; i++)
				cnt[Integer.parseInt(st.nextToken())]++;
			
			int ans = 0, max = 0;
			for (int i = 0; i < 100; i++) {
				if (cnt[i] >= max) {
					ans = i;
					max = cnt[i];
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}