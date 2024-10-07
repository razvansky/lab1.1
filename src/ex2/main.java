package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/ex2/in.txt"));
        int k=0;
        int a[] = new int[100];
        while(scanner.hasNext()) {
            a[k] = scanner.nextInt();
            k++;
        }
        int s=0;
        for(int i = 0;i<k;i++) {
            s = s + a[i];
        }
        int min=a[0];
        for(int i = 1;i<k;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("suma="+s);
        System.out.println("media="+(float)(s/k));
        System.out.println("minim=" + min);
        System.out.println("maxim="+ Arrays.stream(a).max().getAsInt());

        PrintStream flux_out = new PrintStream("out.txt");
        flux_out.println("suma="+s);
        flux_out.println("media="+(float)(s/k));
        flux_out.println("minim=" + min);
        flux_out.println("maxim="+ Arrays.stream(a).max().getAsInt());
    }
}
