import java.util.Scanner;

public class J01004_prime {
    public static String prime(int n) {
        if (n < 2) return "NO";
        for (int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while(t-- > 0) {
            int n = myobj.nextInt();
            System.out.println(prime(n));
        }
    }
}