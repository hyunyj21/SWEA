/*
 * [D3] 2948. 문자열 교집합
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_2948 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			HashMap<String, Integer> map = new HashMap<>();
			
			while(st.hasMoreTokens())
				map.put(st.nextToken(), 0);
			
			String key;
			int ans = 0;
			st = new StringTokenizer(in.readLine(), " ");
			while(st.hasMoreTokens()) {
				key = st.nextToken();
				
				if (map.containsKey(key)) {
					ans++;
					map.remove(key);
				}
			}
			
			System.out.println("#"+t+" "+ans);
		}
	}
}