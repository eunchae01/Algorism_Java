import java.io.IOException;
import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        sc.close();

        for (int i = 2; i >= 0; i--){
            System.out.println(a * (b.charAt(i) - '0'));
        }
        System.out.println(a * Integer.parseInt(b));
    }
}
