/*
 * [D3] 10993. 군주제와 공화제
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10993 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			int[][] city = new int[N][3];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				city[i][0] = Integer.parseInt(st.nextToken());
				city[i][1] = Integer.parseInt(st.nextToken());
				city[i][2] = Integer.parseInt(st.nextToken());
			}
			
			double[][] influence = new double[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					double len = Math.pow(city[i][0]-city[j][0], 2) + Math.pow(city[i][1]-city[j][1], 2);
					
					if (city[i][2]/len > city[j][2]) influence[i][j] = city[i][2]/len;
					else if (city[j][2]/len > city[i][2]) influence[j][i] = city[j][2]/len;
				}
			}
			
			int[] result = new int[N];
			
			for (int i = 0; i < N; i++) {
				int tmp = -1;
				double max = 0;
				
				for (int j = 0; j < N; j++) {
					if (influence[j][i] == 0) continue;
					
					if (influence[j][i] == max) tmp = -2;
					else if (influence[j][i] > max) {
						max = influence[j][i];
						tmp = j+1;
					}
				}
				
				result[i] = tmp;
			}
			
			sb.append("#").append(t);
			
			for (int i = 0; i < N; i++) {
				if (result[i] == -1) {
					sb.append(" K");
					continue;
				}
				
				if (result[i] == -2) {
					sb.append(" D");
					continue;
				}
				
				changeRoot(result, i);
				sb.append(" ").append(result[i]);
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
	
	public static int changeRoot(int[] result, int idx) {
		if (result[idx] < 0) {
			return idx+1;
		}
		
		result[idx] = changeRoot(result, result[idx]-1);
		return result[idx];
	}
}