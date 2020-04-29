/*
 * [D4] 4050. 재관이의 대량 할인
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4050 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			int[] price = new int[N];
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++)
				price[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(price);
			
			long ans = 0;
			for (int i = N-1; i >= 0; i--) {
				ans += price[i--];
				if (i >= 0) ans += price[i--];
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}