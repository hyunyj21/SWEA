/*
 * [D3] 1234. [S/W 문제해결 기본] 10일차 - 비밀번호
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_1234 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int t = 1; t <= 10; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			String code = st.nextToken();
			
			ArrayList<Character> pw = new ArrayList<>();
			pw.add(code.charAt(0));
			
			int idx = 0;
			for (int i = 1; i < N; i++) {
				char tmp = code.charAt(i);
				
				if (idx < 0 || !pw.get(idx).equals(tmp)) {
					pw.add(tmp);
					idx++;
					continue;
				}
				
				pw.remove(idx);
				idx--;
			}
			
			sb.append("#").append(t).append(" ");
			for (int i = 0, len = pw.size(); i < len; i++) {
				sb.append(pw.get(i));
			}
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}