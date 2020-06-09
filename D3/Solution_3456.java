/*
 * [D3] 3456. 직사각형 길이 찾기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3456 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int[] num = new int[3];
			
			for (int i = 0; i < 3; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			
			if (num[0] == num[1]) sb.append(num[2]);
			else if (num[1] == num[2]) sb.append(num[0]);
			
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}