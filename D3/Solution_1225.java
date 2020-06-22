/*
 * [D3] 1225. [S/W 문제해결 기본] 7일차 - 암호생성기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1225 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int t = 1; t <= 10; t++) {
			sb.append("#").append(t);
			in.readLine();
			LinkedList<Integer> num = new LinkedList<>();
			
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			for (int i = 0; i < 8; i++)
				num.offer(Integer.parseInt(st.nextToken()));
			
			stop:
			while(true) {
				for (int i = 1; i < 6; i++) {
					int tmp = num.poll() - i;
					
					if (tmp < 1) {
						num.offer(0);
						break stop;
					}
					
					num.offer(tmp);
				}
			}
			
			for (int i = 0; i < 8; i++)
				sb.append(" ").append(num.get(i));

			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}