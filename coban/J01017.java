package coban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            if(check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
    
    public static Boolean check(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1)) != 1) {
                return false;
            }
        }
        return true;
    }
}
