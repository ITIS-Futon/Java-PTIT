import java.util.Scanner;

public class J01002_SumN {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            int n = myobj.nextInt();
            System.out.println(long(n*(n+1)/2));
        }
    }
}