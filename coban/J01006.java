package coban;

/**
 *
 * @author Quang Pham
 */

import java.util.*;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int d = 3;
            long a = 1L, b = 1L, c = a+b;
            while(d < n) {
                a = b;
                b = c;
                c = a + b;
                d++;
            }
            if(n <= 2) {
                System.out.println("1");
            }
            else {
                System.out.println(c);
            }
        }
    }
}
