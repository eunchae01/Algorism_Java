package 반복문;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int h = N / 4;

        for(int i = 0; i < h; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
