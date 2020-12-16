/*
 * [D4] 1219. [S/W 문제해결 기본] 4일차 - 길찾기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1219 {
	static boolean ans;
	static int[] road1, road2;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int t = 1; t <= 10; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			road1 = new int[100];
			road2 = new int[100];
			
			while (st.hasMoreTokens()) {
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				
				if (road1[start] == 0) road1[start] = end;
				else road2[start] = end;
			}
			
			ans = false;
			bfs();
			
			System.out.println("#"+t+" "+(ans ? 1 : 0));
		}
	}
	
	public static void bfs() {
		LinkedList<Integer> q = new LinkedList<>();
		if (road1[0] != 0) q.offer(road1[0]);
		if (road2[0] != 0) q.offer(road2[0]);
		
		while (!q.isEmpty()) {
			int tmp = q.poll();
			
			if (road1[tmp] == 99 || road2[tmp] == 99) {
				ans = true;
				break;
			}
			
			if (road1[tmp] != 0) q.offer(road1[tmp]);
			if (road2[tmp] != 0) q.offer(road2[tmp]);
		}
	}
}