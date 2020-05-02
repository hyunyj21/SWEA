/*
 * [D2] 1961. 숫자 배열 회전
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1961 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			int N = Integer.parseInt(in.readLine());
			int[][] num = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < N; j++)
					num[i][j] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < N; i++) {
				String tmp = "", tmp2 = "";
				
				for (int j = N-1; j >= 0; j--) {
					sb.append(num[j][i]); //90도
					tmp += num[N-i-1][j]; //180도
					tmp2 += num[N-j-1][N-i-1]; //270도
				}
				
				sb.append(" ").append(tmp).append(" ").append(tmp2).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}