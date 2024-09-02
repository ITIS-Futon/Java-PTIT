i wiimport java.util.Scanner;

public class HCN_J01001 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int d = myobj.nextInt();
        int r = myobj.nextInt();
        if(d <= 0 || r <= 0) {
            System.out.println(0);
        }
        else {
            System.out.print((d+r)*2);
            System.out.print(" ");
            System.out.print(d*r);
        }
    }
}