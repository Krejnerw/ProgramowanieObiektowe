package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_f {
    public static void sumKwadr(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj l. N");
        int n = scan.nextInt();

        System.out.printf("podaj %d l. R\n",n);
        double suma = 0;
        for(int i=0; i<n; i++){
            suma += Math.pow(scan.nextDouble(),2);
        }
        System.out.printf("Suma kwadratow to: %.2f\n",suma);
    }

}
