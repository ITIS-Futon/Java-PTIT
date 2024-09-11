import java.util.Scanner;

public class J01011_gcdandlcm {
    public static long gcd(long a, long b) {
        if (a % b == 0) return b;
        else {
            while (b != 0) {
                long r = a % b;
                a = b;
                b = r;
            }
            return a;
        }
    }

    public static long lcm(long a, long b) {
        if (a % b == 0) return a;
        else return a*b/gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            long a = myobj.nextLong();
            long b = myobj.nextLong();
            System.out.print(lcm(a,b));
            System.out.print(" ");
            System.out.print(gcd(a,b));
            System.out.println();
        }
    }
}