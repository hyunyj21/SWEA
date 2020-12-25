/*
 * [D4] 1258. [S/W 문제해결 응용] 7일차 - 행렬찾기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_1258 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int n = Integer.parseInt(in.readLine());
			boolean[][] matrix = new boolean[n][n];
			
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				
				for (int j = 0; j < n; j++) {
					if (st.nextToken().equals("0")) matrix[i][j] = true;
				}
			}
			
			ArrayList<int[]> tmp = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (matrix[i][j]) continue;
					
					int rlen = i, clen = j;
					while (rlen+1 < n && !matrix[rlen+1][j]) rlen++;
					while (clen+1 < n && !matrix[i][clen+1]) clen++;
					
					for (int k = i; k <= rlen; k++) {
						for (int l = j; l <= clen; l++) {
							matrix[k][l] = true;
						}
					}
					
					rlen -= i-1;
					clen -= j-1;
					
					tmp.add(new int[] {rlen*clen, rlen, clen});
				}
			}
			
			tmp.sort(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] == o2[0]) return o1[1] - o2[1];
					return o1[0] - o2[0];
				}
			});
			
			int total = tmp.size();
			sb.append("#").append(t).append(" ").append(total);
			
			for (int i = 0; i < total; i++) {
				int[] cur = tmp.get(i);
				sb.append(" ").append(cur[1]).append(" ").append(cur[2]);
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}