package Mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02004 {
    public static boolean check(int a[], int sz) {
        for(int i = 0; i < sz; i++) {
            if(a[i] != a[sz - i - 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[105];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if(check(a, n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
