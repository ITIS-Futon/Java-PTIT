import java.util.Scanner;

public class J01016_cnt47 {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        long t = myobj.nextLong();
        int cnt_4 = 0, cnt_7 = 0;
        while(t > 0) {
            long a = t % 10;
            if(a == 4) ++cnt_4;
            if(a == 7) ++cnt_7;
            t /= 10;
        }
        if (cnt_4 + cnt_7 == 4 || cnt_4 + cnt_7 == 7)
            System.out.print("YES");
        else 
            System.out.print("NO");
    }
}