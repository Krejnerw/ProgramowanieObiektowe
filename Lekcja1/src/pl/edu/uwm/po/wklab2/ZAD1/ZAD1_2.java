package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

public class ZAD1_2 {
    public static void Tablica() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj l. N: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d l. R:",n);
        double[] tab = new double[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextDouble();
        }
        for (int i = 1; i < n; i++) {
            System.out.printf("%.2f ", tab[i]);
        }
        System.out.printf("%.2f", tab[0]);
    }

}
