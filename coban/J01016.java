package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        long m = n;
        while(m > 0) {
            if(m % 10 == 4 || m % 10 == 7) {
                cnt++;
            }
            m /= 10;
        }
        if(cnt == 4 || cnt == 7) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
