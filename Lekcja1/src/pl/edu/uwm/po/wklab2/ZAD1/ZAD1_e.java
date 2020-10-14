package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_e {
    public static void absIlOfn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. N: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double iloczyn = 1;
        for(int i=0; i<n; i++){
            iloczyn *= Math.abs(scan.nextDouble());
        }
        System.out.printf("Iloczyn bezwzgl. l. to: %.2f\n",iloczyn);
    }
}
