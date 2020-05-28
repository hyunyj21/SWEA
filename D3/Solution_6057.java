/*
 * [D3] 6057. 그래프의 삼각형
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_6057 {
	static int N, M, ans;
	static ArrayList<boolean[]> line;
	static boolean[] select;
	static int[] num = new int[3];
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			N = Integer.parseInt(st.nextToken())+1;
			M = Integer.parseInt(st.nextToken());			
			line = new ArrayList<>();
			
			for (int i = 0; i < N; i++)
				line.add(new boolean[N]);
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				line.get(x)[y] = true;
			}
			
			ans = 0;
			select = new boolean[N];
			combi(1, 0);
			
			System.out.println("#"+t+" "+ans);
		}
	}
	
	public static void combi(int idx, int cnt) {
		if (cnt == 3) {
			if (line.get(num[0])[num[1]] && line.get(num[0])[num[2]] && line.get(num[1])[num[2]]) ans++;
			return;
		}
		
		for (int i = idx; i < N; i++) {
			if (!select[i]) {
				select[i] = true;
				num[cnt] = i;
				combi(i+1, cnt+1);
				select[i] = false;
			}
		}
	}
}