/*
 * [D3] 5986. 새샘이와 세 소수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_5986 {
	static int N, ans;
	static boolean[] num;
	static ArrayList<Integer> prime;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			num = new boolean[N];

			eratos();
			
			prime = new ArrayList<>();
			for (int i = 2; i < N; i++) {
				if (!num[i]) prime.add(i);
			}
			
			ans = 0;
			combi(0,0,0);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void eratos() {
		for (int i = 2; i*i < N; i++) {
			for (int j = i*i; j < N; j+=i)
				num[j] = true;
		}
	}
	
	public static void combi(int start, int cnt, int sum) {
		if (cnt == 3) {
			if (sum == N) ans++;
			return;
		}
		
		for (int i = start, len = prime.size(); i < len; i++) {
			if (sum+prime.get(i) > N) return;
			combi(i, cnt+1, sum+prime.get(i));
		}
	}
}