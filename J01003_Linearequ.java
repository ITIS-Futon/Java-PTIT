import java.util.Scanner;

public class J01003_Linearequ {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        float a = myobj.nextFloat();
        float b = myobj.nextFloat();
        if (a == 0) 
            System.out.println("VN");
        else {
            if (b == 0)
                System.out.println("VSN");
            else
                System.out.printf("%.2f", -b/a);
        }
    }
}