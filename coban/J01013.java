package coban;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class J01013 {
    public static final int N = 2000000;
    public static int isPrime[] = new int[N + 5];
    
    public static void seive() {
        isPrime[0] = isPrime[1] = 1;
        for(int i = 2; i * i <= N; i++) {
            if(isPrime[i] == 0) {
                for(int j = i * i; j <= N; j += i) 
                    isPrime[j] = i;
            }
        }
        for(int i = 2; i <= N; i++) {
            if(isPrime[i] == 0)
                isPrime[i] = i;
        }
    }
    
    public static int sumOfPrimeDivisor(int n) {
        if(isPrime[n] == n) {
            return n;
        }
        int tmp = 0;
        while(n > 1) {
            tmp += isPrime[n];
            n /= isPrime[n];
        }
        return tmp;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans = 0L;
        seive();
        while(t-- > 0) {
            int n = sc.nextInt();
            ans += (long) sumOfPrimeDivisor(n);
        }
        System.out.println(ans);
    }
}
