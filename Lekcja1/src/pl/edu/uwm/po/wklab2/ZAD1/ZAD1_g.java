package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_g {
    public static  void sumaANDil(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. Naturalna: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double suma = 0, iloczyn =1;
        for(int i=0; i<n; i++){
            double l = scan.nextDouble();
            suma += l;
            iloczyn *= l;
        }
        System.out.printf("Suma l. to: %.2f\n",suma);
        System.out.printf("Iloczyn l. to: %.2f\n",iloczyn);
    }
}
