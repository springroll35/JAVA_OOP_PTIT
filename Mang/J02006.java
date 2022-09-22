package Mang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int a[] = new int[1005];
            int b[] = new int[1005];
            for(int i = 0; i < m; i++) {
                int x = sc.nextInt();
                a[x]++;
            }
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                b[x]++;
            }
            for(int i = 0; i <= 1000; i++) {
                if(a[i] > 0 || b[i] > 0) 
                    System.out.print(i + " ");
            } 
        }
    }

}
