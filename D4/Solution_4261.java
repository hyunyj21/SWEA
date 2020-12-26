/*
 * [D4] 4261. 빠른 휴대전화 키패드
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4261 {
	static char[][] keypad = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
							  {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			String S = st.nextToken();
			
			int len = S.length();
			int[] num = new int[len];
			
			for (int i = 0; i < len; i++) {
				num[i] = S.charAt(i) - '0';
			}
			
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(in.readLine(), " ");
			
			int ans = 0;
			
			for (int i = 0; i < N; i++) {
				String word = st.nextToken();
				boolean result = true;
				
				for (int j = 0; j < len; j++) {
					char[] key = keypad[num[j]];
					boolean flag = false;
					
					for (int k = 0, l = key.length; k < l; k++) {
						if (word.charAt(j) == key[k]) {
							flag = true;
							break;
						}
					}
					
					if (!flag) {
						result = false;
						break;
					}
				}
				
				if (result) ans++;
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}