/*
 * 1984. 중간 평균값 구하기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1984 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");

			int[] num = new int[10];
			for (int i = 0; i < 10; i++)
				num[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			
			double sum = 0;
			for (int i = 1; i < 9; i++)
				sum += num[i];
			
			System.out.println("#"+t+" "+Math.round(sum/8));
		}
	}
}