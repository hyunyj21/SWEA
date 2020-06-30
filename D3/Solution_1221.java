/*
 * [D3] 1221. [S/W 문제해결 기본] 5일차 - GNS
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_1221 {
	static String[] num = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			HashMap<String, Integer> cnt = new HashMap<>();
			for (int i = 0; i < 10; i++)
				cnt.put(num[i], 0);
			
			while(st.hasMoreTokens()) {
				String tmp = st.nextToken();
				cnt.put(tmp, cnt.get(tmp)+1);
			}
			
			for (int i = 0; i < 10; i++) {
				for (int j = 0, len = cnt.get(num[i]); j < len; j++)
					sb.append(num[i]).append(" ");
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}