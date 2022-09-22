package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            if(!check(n) || doi(n) == 0) {
                System.out.println("INVALID");
            }
            else {
                System.out.println(doi(n));
            }
        }
    }
    
    public static Boolean check(long n) {
        long m = n;
        while(m > 0) {
            if (m % 10 != 0 && m % 10 != 1 && m % 10 != 8 && m % 10 != 9)
                return false;
            m /= 10;
        }
        return true;
    }
    
    public static long doi(long n) {
        long []a = new long[20];
        long m = n;
        int cnt = 0;
        while(m > 0) {
            a[cnt++] = m % 10;
            m /= 10;
        }
        for(int i = 0; i < cnt; i++) {
            if(a[i] == 0 || a[i] == 8 || a[i] == 9)
                a[i] = 0;
        }
        long ans = 0L;
        for(int i = cnt - 1; i >= 0; i--) 
            ans = ans * 10 + a[i];
        return ans;
    }
}
