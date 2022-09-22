package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        int n = sc.nextInt();
        int cnt = 0;
        if(n % 2 == 0) cnt++;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                int j = n / i;
                if(i % 2 == 0) cnt++;
                if(i != j) {
                    if(j % 2 == 0) cnt++;
                }
            }
        }
        System.out.println(cnt);
        }
    }
}
