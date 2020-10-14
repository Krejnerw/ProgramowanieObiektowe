package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_a {
    public static void sumOfn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. Naturalna: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double suma = 0;
        for(int i=0; i<n; i++){
            suma += scan.nextDouble();
        }
        System.out.printf("Suma l. to: %.2f\n",suma);
    }
}
