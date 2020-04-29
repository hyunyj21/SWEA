/*
 * [D2] 1926. 간단한 369게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1926 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= N; i++) {
			String tmp = Integer.toString(i);
			int len = tmp.length(), cnt = 0;
			
			for (int j = 0; j < len; j++) {
				if (tmp.charAt(j) != '0' && (tmp.charAt(j)-48)%3 == 0) cnt++;
			}
			
			if (cnt != 0) {
				for (int j = 0; j < cnt; j++) sb.append("-");
			} else {
				for (int j = 0; j < len; j++) sb.append(tmp.charAt(j));
			}
			
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}