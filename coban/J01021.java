package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */

public class J01021 {
    final static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0)
                break;
            System.out.println(powMod(a, b));
        }
    }
    
    public static long powMod(long a, long b) {
        if(b == 0)
            return 1;
        long tmp = powMod(a, b / 2);
        if(b % 2 == 1)
            return ((tmp * tmp % mod) * a) % mod;
        else
            return (tmp * tmp % mod) % mod;
    }
}
