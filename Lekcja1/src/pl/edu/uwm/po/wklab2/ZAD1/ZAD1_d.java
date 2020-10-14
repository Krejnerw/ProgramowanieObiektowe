package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_d {
    public static void sumOfAbsSqrt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. N: ");
        int n = scan.nextInt();
        System.out.printf("podaj %d l. R:\n",n);

        double suma = 0;
        for(int i=0; i<n; i++){
            suma += Math.sqrt(Math.abs(scan.nextDouble()));
        }
        System.out.printf("Suma bezwzgl. z pierw. to: %.2f\n",suma);
    }
}
