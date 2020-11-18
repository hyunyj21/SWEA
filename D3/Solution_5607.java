/*
 * [D3] 5607. [Professional] 조합
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5607 {
	static int num = 1234567891;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		long[] fact = new long[1000001];
		fact[0] = 1;
		
		for (int i = 1; i <= 1000000; i++) {
			fact[i] = (fact[i-1] * i) % num;
		}
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			
			long bottom = (fact[N-R] * fact[R]) % num;
			long ans = (fact[N] / bottom) % num;
			
			System.out.println("#"+t+" "+ans);
		}
	}
}