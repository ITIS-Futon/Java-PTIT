import java.util.Scanner;

public class J01009_sumfac {
    public static long sum(int n) {
        long sum = 0;
        long j = 1;
        for (int i = 1; i <= n; ++i) {
            for (int k = 1; k <= i; ++k) j *= k;
            sum += j;
            j = 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        System.out.println(sum(t));
    }
}