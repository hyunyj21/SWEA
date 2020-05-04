/*
 * [D2] 1928. Base64 Decoder
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

public class Solution_1928 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			String encode = in.readLine();
			byte[] tmp = Base64.getDecoder().decode(encode);
			
			System.out.println("#"+t+" "+new String(tmp));
		}
	}
}