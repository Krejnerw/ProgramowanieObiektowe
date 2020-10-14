package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_c {
     public static void absSumOfn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. N: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double suma = 0;
        for(int i=0; i<n; i++){
            suma += Math.abs(scan.nextDouble());
        }
        System.out.printf("Suma bezwzgl. to: %.2f\n",suma);
    }
}
