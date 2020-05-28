/*
 * [D3] 6019. 기차 사이의 파리
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6019 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			double D = Double.parseDouble(st.nextToken());
			double A = Double.parseDouble(st.nextToken());
			double B = Double.parseDouble(st.nextToken());
			double F = Double.parseDouble(st.nextToken());
			
			F *= D/(A+B);
			sb.append("#").append(t).append(" ").append(F).append("\n");
		}
		
		System.out.print(sb);
	}
}