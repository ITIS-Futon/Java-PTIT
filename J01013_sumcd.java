import java.util.Scanner;

public class J01013_sumcd {
    public static int[] prime(int n) {
        int[] Prime = new int[n+1];
        for(int i = 2; i <= n; ++i) {
            Prime[i] = 1;
        }
        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if (Prime[i] == 1) {
                for(int j = i*i; j <= n; j+=i) {
                    Prime[j] = 0;
                }
            }
        }
        return Prime;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int n = myobj.nextInt();
        long sum = 0;
        int max = 2000000;
        int[] Prime = prime(max);
        for(int i = 1; i <= n; ++i) {
            int m = myobj.nextInt();
            for(int j = 2; j <= Math.sqrt(m); ++j) {
                if (Prime[j] == 1) {
                    while (m % j == 0) {
                        sum += j;
                        m /= j;
                    }
                }
            }
            if (m > 1) sum += m;
        }
        System.out.print(sum);
    }
}