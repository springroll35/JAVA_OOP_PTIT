package coban;

import java.util.Scanner;

/**
 *
 * @author Quang Pham
 */
public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("VSN");
        }
        else if (a == 0 && b != 0) {
            System.out.println("VN");
        }
        else {
            double ans = -b / a;
            System.out.printf("%.2f", ans);
        }
    }
}
