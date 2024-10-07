package ex3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        int n = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(" " + i);
                n++;
            }
        }
        if(n<1) {
            System.out.println("nr e prim");
        }
    }
}