/*
 * [D2] 1983. 조교의 성적 매기기
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1983 {
	static String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(in.readLine());
		
		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			Student[] students = new Student[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				int score = Integer.parseInt(st.nextToken())*35+Integer.parseInt(st.nextToken())*45+Integer.parseInt(st.nextToken())*20;
				students[i] = new Student(i+1, score);
			}
			
			Arrays.sort(students);
			
			int idx = 0;
			for (int i = 0; i < N; i++) {
				if (students[i].num == K) {
					idx = i;
					break;
				}
			}
			
			System.out.println("#"+t+" "+grade[idx/(N/10)]);
		}
	}
	
	static class Student implements Comparable<Student> {
		private int num;
		private int score;

		public Student(int num, int score) {
			this.num = num;
			this.score = score;
		}
		
		@Override
		public int compareTo(Student s) {
			return s.score - this.score;
		}
	}
}