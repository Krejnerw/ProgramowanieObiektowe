package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_b {
    public static void ilOfn(){
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. N: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double iloczyn = 1;
        for(int i=0; i<n; i++){
            iloczyn *= scan.nextDouble();
        }
        System.out.printf("Iloczyn l. to: %.2f\n",iloczyn);
    }
}
