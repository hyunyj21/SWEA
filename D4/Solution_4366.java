/*
 * [D4] 4366. 정식이의 은행업무
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Solution_4366 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
 
        for (int t = 1; t <= tc; t++) {
            String binary = in.readLine();
            String ternary = in.readLine();
            long bTen = Long.parseLong(binary, 2);
            long tTen = Long.parseLong(ternary, 3);
            long ans = 0;
             
            fin:
            for (int i = 0, len = binary.length(); i < len; i++) {
                ans = bTen;
                 
                if (binary.charAt(i) == '0') ans += (long) Math.pow(2, len-i-1);
                else ans -= (long) Math.pow(2, len-i-1);
                 
                for (int j = 0, l = ternary.length(); j < l; j++) {
                    long tmp = tTen;
                     
                    switch (ternary.charAt(j)-48) {
                        case 0:
                            tmp += (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
                             
                            tmp += (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
                             
                            break;
                        case 1:
                            tmp -= (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
                             
                            tmp += 2 * (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
 
                            break;
                        case 2:
                            tmp -= (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
                             
                            tmp -= (long) Math.pow(3, l-j-1);
                            if (tmp == ans) break fin;
                             
                            break;
                    }
                }
            }
             
            System.out.println("#"+t+" "+ans);
        }
    }
}