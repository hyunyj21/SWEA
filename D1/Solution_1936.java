/*
 * [D1] 1936. 1대1 가위바위보
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1936 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if ((A==1 && B==3) || (A==2 && B==1) || (A==3 && B==2)) System.out.println("A");
		else System.out.println("B");
	}
}