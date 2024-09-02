import java.util.Scanner;

public class fibo_J01006 {
    public static Long fibo(long n) {
        if (n <= 1) return n;
        long f1 = 1, f2 = 1;
        for (long i = 3; i <= n; ++i) {
            long f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f2;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while(t-- > 0) {
            long n = myobj.nextInt();
            System.out.println(fibo(n));
        }
    }
}