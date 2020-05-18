/*
 * [D3] 7227. 사랑의 카운슬러
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7227 {
	static int N;
	static int[][] worm;
	static long ans;
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			N = Integer.parseInt(in.readLine());
			worm = new int[N][2];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				worm[i][0] = Integer.parseInt(st.nextToken());
				worm[i][1] = Integer.parseInt(st.nextToken());
			}
			
			ans = Long.MAX_VALUE;
			check = new boolean[N];
			combi(0,0);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void combi(int idx, int cnt) {
		if (cnt == N/2) {
			long tmpX = 0, tmpY = 0;
			
			for (int i = 0; i < N; i++) {
				if (check[i]) {
					tmpX += worm[i][0];
					tmpY += worm[i][1];
				} else {
					tmpX -= worm[i][0];
					tmpY -= worm[i][1];
				}
				
			}
			
			ans = Math.min(ans, tmpX*tmpX+tmpY*tmpY);
			return;
		}
		
		for (int i = idx; i < N; i++) {
			check[i] = true;
			combi(i+1,cnt+1);
			check[i] = false;
		}
	}
}