package Mang;

import java.util.Scanner;

public class J01018 {
    public static boolean check(long a[], int sz) {
        for(int i = 1; i < sz; i++) {
            if(Math.abs(a[i] - a[i-1]) != 2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long m = n;
            long a[] = new long[100];
            int cnt = 0;
            while(m > 0) {
                a[cnt++] = m % 10;
                m /= 10;
            }
            long tmp = 0;
            for(int i = 0; i < cnt; i++) {
                tmp += a[i];
            }
            if(tmp % 10 == 0 && check(a, cnt)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
