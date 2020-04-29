/*
 * [D2] 2005. 파스칼의 삼각형
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_2005 {
	static ArrayList<int[]> memo = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		memo.add(new int[] {1});
		memo.add(new int[] {1, 1});
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append("\n");
			int N = Integer.parseInt(in.readLine());
			int size = 0;
			
			while ((size = memo.size()) < N) {
				int[] tmp = new int[size+1];
				int[] cur = memo.get(size-1);
				
				for (int i = 0; i <= size; i++) {
					if (i == 0 || i == size) tmp[i] = 1;
					else tmp[i] = cur[i-1] + cur[i];
				}
				
				memo.add(tmp);
			}
			
			for (int i = 0; i < N; i++) {
				int[] cur = memo.get(i);
				
				for (int j = 0, len = cur.length; j < len; j++) {
					sb.append(cur[j]).append(" ");
				}
				
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}