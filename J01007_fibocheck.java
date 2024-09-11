import java.util.Scanner;

public class J01007_fibocheck {
    public static String check(long n) {
        if (n <= 1) return "YES";
        else {
            long f1 = 1, f2 = 1;
            for(long i = 3; i <= 92; ++i) {
                long f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                if (n == f2) return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            long n = myobj.nextLong();
            System.out.println(check(n));
        }
    }
}