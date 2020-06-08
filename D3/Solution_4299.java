/*
 * [D3] 4299. 태혁이의 사랑은 타이밍
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4299 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int D = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			if ((D==11 && H<11) || (D==11 && H==11 && M<11)) {
				sb.append("-1\n");
				continue;
			}
			
			if (M < 11) {
				H--;
				M += 60;
			}
			if (H < 11) {
				D--;
				H += 24;
			}
			
			sb.append((D-11)*24*60+(H-11)*60+(M-11)).append("\n");
		}
		
		System.out.println(sb);
	}
}