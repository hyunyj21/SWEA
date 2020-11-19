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
			
			long bottom = fermat((fact[N-R] * fact[R]) % num, num-2);
			long ans = (fact[N] * bottom) % num;
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static long fermat(long n, int x) {
		if (x == 0) return 1;
		
		long tmp = fermat(n, x/2);
		long ret = (tmp * tmp) % num;
		
		if (x % 2 == 0) return ret;
		else return (ret * n) % num;
	}
}