package coban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int r = (int) Math.sqrt(n);
            if(r * r == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
