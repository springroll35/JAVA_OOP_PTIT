package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */
public class J01009 {
    public static long gt(long n) {
        long ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for(int i = 1; i <= n; i++) {
            ans += gt(i);
        }
        System.out.println(ans);
    }
}
