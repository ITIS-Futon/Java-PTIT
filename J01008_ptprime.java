import java.util.Scanner;

public class J01008_ptprime {
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
        for (int T = 1; T <= t; ++T) {
            System.out.printf("Test %d: ", T);
            int n = myobj.nextInt();
            for (int i = 2; i <= Math.sqrt(n); ++i) {
                if(prime(i) == 1 && n % i == 0) {
                    System.out.print(i);
                    System.out.print("(");
                    int cnt = 0;
                    while(n % i == 0) {
                        ++cnt;
                        n /= i;
                    }
                    System.out.print(cnt);
                    System.out.print(") ");
                }
            }
            if(prime(n) == 1) {
                System.out.print(n);
                System.out.print("(1)");
            }
            System.out.print("\n");
        }
    }
}