/*
 * [D2] 1954. 달팽이 숫자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1954 {
	public static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}}; //우,하,좌,상
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			int N = Integer.parseInt(in.readLine());
			int[][] snail = new int[N][N];
			
			snail[0][0] = 1;
			int num = 2, i = 0, j = 0, k = 0;
			while(num <= N*N) {
				int r = i + dir[k][0];
				int c = j + dir[k][1];
				
				if (r > -1 && r < N && c > -1 && c < N && snail[r][c] == 0) {
					snail[r][c] = num;
					num++;
					i = r;
					j = c;
					continue;
				}
				
				if (k < 3) k++;
				else k = 0;
			}
			
			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++)
					sb.append(snail[i][j]).append(" ");
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}