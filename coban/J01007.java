package coban;

/**
 *
 * @author Quang Pham
 */

import java.util.*;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            int d = 3;
            long a = 1L, b = 1L, c = a+b;
            Boolean ok = false;
            while(d < 92) {
                a = b;
                b = c;
                c = a + b;
                if(c == n) {
                    ok = true;
                    break;
                }
                d++;
            }
            if(n == 0 || n == 1 || n == 2) ok = true;
            if(ok) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
