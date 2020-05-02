/*
 * [D2] 1966. 숫자를 정렬하자
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1966 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			int N = Integer.parseInt(in.readLine());
			int[] num = new int[N];
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < N; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			
			for (int i = 0; i < N; i++)
				sb.append(num[i]).append(" ");
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}