import java.util.Scanner;

public class J01014_gprimecd {
    public static int prime(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while(t-- > 0) {
            long n = myobj.nextLong();
            long max = 0;
            for(int i = 2; i <= Math.sqrt(n); ++i) {
                if(prime(i) == 1) {
                    if(max < i) max = i;
                    while(n % i == 0) {
                        n /= i;
                    }
                }
            }
            if(n > 1) {
                if(max < n) max = n;
            }
            System.out.println(max);
        }
    }
}