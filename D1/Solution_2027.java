/*
 * [D1] 2027. 대각선 출력하기
 */

public class Solution_2027 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == j) sb.append("#");
				else sb.append("+");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}