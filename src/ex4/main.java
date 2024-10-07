package ex4;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(30);
        int b = rand.nextInt(30);
        System.out.println(a + " " + b);
        for (int i = 2; i < a; i++) {
            if ((a % i == 0)) {
                for (int j = 2; j < b; j++) {
                    if ((b % j == 0)) {
                        if (i == j) {
                            System.out.println("cmmdc="+i);
                            return;
                        }
                    }
                }
            }
        }
    }
}
