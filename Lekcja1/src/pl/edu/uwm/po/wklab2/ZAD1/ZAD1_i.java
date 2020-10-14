package pl.edu.uwm.po.wklab2.ZAD1;

import java.util.Scanner;

class ZAD1_i {
    public static int silnia(int n){
        int il = 1;
        for(int i=1; i<=n; i++){
            il *= i;
        }
        return il;
    }
    public static void ZAD1_i(){
//        ZAD1_b silnia = new ZAD1_b();
        double silnia;
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz l. Naturalna: ");
        int n = scan.nextInt();
        System.out.printf("Podaj %d liczb R:\n",n);

        double suma = 0;
        for(int i=0; i<n; i++){
            suma += (Math.pow(-1,i+1)*(scan.nextDouble()))/silnia(i+1);
        }
        System.out.printf("Suma l. to: %.2f\n",suma);
    }
}
