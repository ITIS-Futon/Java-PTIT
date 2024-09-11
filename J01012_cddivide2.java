import java.util.Scanner;

public class J01012_cddivide2 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            int n = myobj.nextInt();
            if(n % 2 != 0) System.out.println(0);
            else {
                int cnt = 0;
                for(int i = 1; i <= Math.sqrt(n); ++i) {
                    if (n % i == 0) {
                        if (i % 2 == 0)
                            ++cnt;
                        if (i != n/i && (n/i) % 2 == 0) 
                            ++cnt;
                    }
                }
                System.out.println(cnt);
            }
        }
    }
}