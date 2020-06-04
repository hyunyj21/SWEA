/*
 * [D3] 5293. 이진 문자열 복원
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5293 {
	static int[] cnt = new int[4];
	static String ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			for (int i = 0; i < 4; i++)
				cnt[i] = Integer.parseInt(st.nextToken());
			
			ans = null;
			solve(cnt[0], cnt[1], cnt[2], cnt[3], "0");
			solve(cnt[0], cnt[1], cnt[2], cnt[3], "1");
			
			if (ans == null) ans = "impossible";
			sb.append(ans).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void solve(int a, int b, int c, int d, String tmp) {
		if (ans != null) return;
		if (a<0 || b<0 || c<0 || d<0) return;
		if (Math.abs(b-c) > 1) return;
		if (a==0 && b==0 && c==0 && d==0) {
			ans = tmp;
			return;
		}
		
		if (tmp.charAt(tmp.length()-1) == '0') {
			solve(a-1, b, c, d, tmp+"0");
			solve(a, b-1, c, d, tmp+"1");
		} else {
			solve(a, b, c-1, d, tmp+"0");
			solve(a, b, c, d-1, tmp+"1");
		}
	}
}