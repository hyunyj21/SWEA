/*
 * [D3] 7985. Rooted Binary Tree 재구성
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_7985 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			int K = Integer.parseInt(in.readLine());
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			
			if (K == 1) {
				sb.append(Integer.parseInt(st.nextToken())).append("\n");
				continue;
			}
			
			int len = (int) Math.pow(2, K) - 1;
			int[] num = new int[len];
			for (int i = 0; i < len; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			LinkedList<int[]> q = new LinkedList<>();
			q.offer(new int[] {0, (len-1)/2, len-1});
			
			int cnt = 0, max = 1;
			while(!q.isEmpty()) {
				int[] tmp = q.poll();
				int left = tmp[0];
				int mid = tmp[1];
				int right = tmp[2];
				
				if (left == right) sb.append(num[left]);
				else {
					sb.append(num[mid]);
					q.offer(new int[] {left, (mid-1-left)/2+left, mid-1});
					q.offer(new int[] {mid+1, (right-mid+1)/2+mid, right});
				}
				
				cnt++;
				if (cnt == max) {
					sb.append("\n");
					cnt = 0;
					max *= 2;
				} else sb.append(" ");
			}
		}
		
		System.out.print(sb);
	}
}