/*
 * [D3] 1240. [S/W 문제해결 응용] 1일차 - 단순 2진 암호코드
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1240 {
	static String[] num = {"0001101","0011001","0010011","0111101","0100011","0110001","0101111","0111011","0110111","0001011"};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			
			String code = "";
			boolean check = false;
			for (int i = 0; i < N; i++) {
				if (check) {
					in.readLine();
					continue;
				}
				
				String tmp = in.readLine();
				int idx = tmp.lastIndexOf('1');
				
				if (idx == -1) continue;
				
				idx -= 55;
				for (int k = 0; k < 8; k++) {
					String p = tmp.substring(idx, idx+7);
					
					for (int l = 0; l < 10; l++) {
						if (num[l].equals(p)) {
							code += l;
							break;
						}
					}
					
					idx += 7;
				}
				
				check = true;
			}
			
			int even = 0, odd = 0;
			for (int i = 0; i < 8; i++) {
				if (i%2 == 0) odd += code.charAt(i) - '0';
				else even += code.charAt(i) - '0';
			}
			
			if ((odd*3+even)%10 != 0) System.out.println("#"+t+" 0");
			else System.out.println("#"+t+" "+(even+odd));
		}
	}
}