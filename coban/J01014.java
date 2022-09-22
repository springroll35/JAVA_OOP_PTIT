package coban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class J01014 {
    public static Boolean isPrime(long n) {
        if(n < 2)
            return false;
        for(long i = 2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long ans = 0L;
            for(long i = 1; i <= (long) Math.sqrt(n); i++) {
                if(n % i == 0) {
                    if(isPrime(n / i)) {
                        //System.out.println(n / i);
                        ans = n / i;
                        break;
                    }
                    else if(isPrime(i)) {
                        ans = i;
                    }
                }
                
            }
            System.out.println(ans);
        }
    }
}

