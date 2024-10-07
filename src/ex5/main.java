package ex5;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(20);
        int v[]={0, 1, 2, 3, 5, 8, 13, 21};
        System.out.println(a);
        for(int i =0;i<v.length;i++)
        {
            if(a==v[i]) {
                System.out.println("nr APARTINE sir fibo");
                return;
            }
        }
        System.out.println("nr NU apartine sir fibo");
    }
}
