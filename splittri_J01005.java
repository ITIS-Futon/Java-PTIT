import java.util.Scanner;
/*
    diện tích tam giác ban đầu: H/2
    chia thành N phần có S = nhau: H/2N
    diện tích tam giác tại lớp cắt đầu tiên:
    AH/AG = BC/DE <=> x/H = y
    1/2*AH*BC = 1/2*x*y = x^2/2H
    x^2/2H = i*H/2N
    => x = H*sqrt(i/N)
*/

public class splittri_J01005 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int t = myobj.nextInt();
        while (t-- > 0) {
            int n = myobj.nextInt();
            int h = myobj.nextInt();
            for(int i = 1; i < n; ++i)
                System.out.printf("%.6f ", h*Math.sqrt((double)i/n));
            System.out.println();
        }
    }
}