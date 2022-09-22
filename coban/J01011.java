package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */

public class J01012 {
    static long gcd(long a, long b) {
        return (a == 0) ? b : gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong(), h = sc.nextLong();
            for(int i = 1; i < n; i++) {
                System.out.printf("%.6f");
            }
        }
    }
}
