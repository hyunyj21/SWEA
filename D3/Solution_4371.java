/*
 * [D3] 4371. 항구에 들어오는 배
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution_4371 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			int N = Integer.parseInt(in.readLine());
			in.readLine();
			
			ArrayList<Integer> day = new ArrayList<>();
			day.add(Integer.parseInt(in.readLine())-1);
			for (int i = 2; i < N; i++) {
				int tmp = Integer.parseInt(in.readLine());
				
				boolean check = false;
				for (int j = 0, len = day.size(); j < len; j++) {
					if (tmp % day.get(j) == 1) {
						check = true;
						break;
					}
				}
				
				if (!check)
					day.add(tmp-1);
			}
			
			System.out.println("#"+t+" "+day.size());
		}
	}
}