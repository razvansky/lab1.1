package ex1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        int a = scanner.nextInt();
        System.out.println("b=");
        int b = scanner.nextInt();
        System.out.println("aria = "+ a*b);
        System.out.println("perimetru = "+2*(a+b));

        scanner.close();
    }
}
