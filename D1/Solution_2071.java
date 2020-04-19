/*
 * [D1] 2071. 평균값 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2071 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			double ans = 0;
			
			for (int i = 0; i < 10; i++) 
				ans += Double.parseDouble(st.nextToken());
			
			ans /= 10;
			
			sb.append("#"+t+" "+Math.round(ans)+"\n"); //Math.round(): 소수점 첫째자리에서 반올림하여 정수로 반환하는 함수
		}
		
		System.out.println(sb);
	}
}