/*
 * [D3] 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1244 {
	static int len, total, ans;
	static int[] num;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String tmp = st.nextToken();
			len = tmp.length();
			total = Integer.parseInt(st.nextToken());
			
			num = new int[len];
			for (int i = 0; i < len; i++) {
				num[i] = tmp.charAt(i) - '0';
			}
			
			ans = 0;
			dfs(0);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void dfs(int cnt) {
		if (cnt == total) {
			int result = arrayToInt();
			if (result > ans) ans = result;

			return;
		}
		
		int i = cnt;
		if (cnt >= len-1) i = len-2;
		
		for (; i < len-1; i++) {
			int tmp = num[i];

			for (int j = i+1; j < len; j++) {
				num[i] = num[j];
				num[j] = tmp;
				
				dfs(cnt+1);
				
				num[j] = num[i];
				num[i] = tmp;
			}
		}
	}
	
	public static int arrayToInt() {
		int result = 0;
		
		int digit = 1;
		for (int i = len-1; i > -1; i--) {
			result += num[i] * digit;
			digit *= 10;
		}
		
		return result;
	}
}