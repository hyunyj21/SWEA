/*
 * [D3] 4676. 늘어지는 소리 만들기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4676 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			String word = in.readLine();
			int len = word.length();
			int[] cnt = new int[len+1];
			
			int total = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < total; i++)
				cnt[Integer.parseInt(st.nextToken())]++;
			
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < cnt[i]; j++)
					sb.append("-");
				sb.append(word.charAt(i));
			}
			
			for (int i = 0; i < cnt[len]; i++)
				sb.append("-");
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}