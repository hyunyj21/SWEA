/*
 * [D3] 6190. 정곤이의 단조 증가하는 수
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution_6190 {
    static int N, ans;
    static int[] num, idx = new int[2];
    static boolean[] select;
     
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
         
        for (int t = 1; t <= tc; t++) {
            N = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            num = new int[N];
            select = new boolean[N];
             
            for (int i = 0; i < N; i++)
                num[i] = Integer.parseInt(st.nextToken());
             
            ans = -1;
            combi(0, 0);
             
            System.out.println("#"+t+" "+ans);
        }
    }
     
    public static void combi(int start, int cnt) {
        if (cnt == 2) {
            int mul = num[idx[0]] * num[idx[1]];
             
            if (check(mul)) ans = Math.max(ans, mul);
            return;
        }
 
        for (int i = start; i < N; i++) {
            if (!select[i]) {
                select[i] = true;
                idx[cnt] = i;
                combi(i+1, cnt+1);
                select[i] = false;
            }
        }
    }
 
    public static boolean check(int num) {
        int a = 9, b;
         
        while(num > 0) {
            b = num % 10;
            num /= 10;
             
            if (b > a) return false;
             
            a = b;
        }
         
        return true;
    }
}