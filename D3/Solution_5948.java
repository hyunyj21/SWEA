/*
 * [D3] 5948. 새샘이의 7-3-5 게임
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_5948 {
	static int[] num;
	static boolean[] check;
	static ArrayList<Integer> ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			num = new int[7];
			
			for (int i = 0; i < 7; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			check = new boolean[301];
			ans = new ArrayList<>();
			combi(0,0,0);
			
			ans.sort(Collections.reverseOrder());
			sb.append("#").append(t).append(" ").append(ans.get(4)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static void combi(int start, int cnt, int sum) {
		if (cnt == 3) {
			if (!check[sum]) {
				ans.add(sum);
				check[sum] = true;
			}
			
			return;
		}
		
		for (int i = start; i < 7; i++)
			combi(i+1, cnt+1, sum+num[i]);
	}
}