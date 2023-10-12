import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int b = 0; b < a.length(); b++){
            System.out.println(a.charAt(b));
        }
    }
}