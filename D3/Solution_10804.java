/*
 * [D3] 10804. 문자열의 거울상
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Solution_10804 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			sb.append("#").append(t).append(" ");
			
			String word = in.readLine();
			for (int i = word.length()-1; i > -1; i--) {
				switch (word.charAt(i)) {
					case 'b':
						sb.append('d');
						break;
					case 'd':
						sb.append('b');
						break;
					case 'p':
						sb.append('q');
						break;
					case 'q':
						sb.append('p');
				}
			}
			
			sb.append("\n");
		}
		
		System.out.print(sb);
	}
}