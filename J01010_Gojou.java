import java.util.Scanner;

public class J01010_Gojou {
    public static long gojou(long n) {
        long m = 0, p = 1;
        while (n > 0) {
            long a = n % 10;
            if (a == 0 || a == 8 || a == 9) a = 0;
            else if (a == 1) a = 1;
            else return -1;
            m = a*p + m;
            p *= 10;
            n /= 10;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            long n = myobj.nextLong();
            if(gojou(n) <= 0) 
                System.out.println("INVALID");
            else 
                System.out.println(gojou(n));
        }
    }
}