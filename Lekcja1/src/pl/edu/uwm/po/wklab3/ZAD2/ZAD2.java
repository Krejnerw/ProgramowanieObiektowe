package pl.edu.uwm.po.wklab3.ZAD2;

import java.util.Random;
import java.util.Scanner;

public class ZAD2 {
    public static void wyswietlTab(int[] tab){
        for(int i =0;i<tab.length-1;i++){
            System.out.printf("%d,",tab[i]);
        }
        System.out.println(tab[tab.length-1]);
    }
    public static Scanner scan = new Scanner(System.in);

    public static int podajN() {
        System.out.println("Podaj liczbe calk.:");
        int n;
        while (true) {
            n = scan.nextInt();
            if (n >= 1 && n <= 100) {
                break;
            }
            System.out.println("Podaj liczbe " +
                    "z przedzialu 1-100");
        }
        return n;
    }

    public static int[] generuj(int tab[], int n, int minWart, int maxWart) {
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = generator.nextInt(maxWart * 2 + 1) - minWart;
        }
        return tab;
    }

    public static int ileParzystych(int[] tab) {
        int parz = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                parz++;
            }
        }
        System.out.println("Liczby parzyste: " + parz);
        return parz;
    }

    public static int ileNieparzystych(int[] tab) {
        int Nparz = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                Nparz++;
            }
        }
        System.out.println("liczby nieparzyste: " + Nparz);
        return Nparz;
    }

    public static int ileDodatnich(int tab[]) {
        int Dod = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                Dod++;
            }
        }
        System.out.println("Liczby dodatnie: " + Dod);
        return Dod;
    }

    public static int ileUjemnycg(int tab[]) {
        int Uj = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                Uj++;
            }
        }
        System.out.println("Liczby ujemne: " + Uj);
        return Uj;
    }

    public static int ileZerowych(int tab[]) {
        int Zer = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                Zer++;
            }
        }
        System.out.println("Liczby zerowe: " + Zer);
        return Zer;
    }

    public static int ileMaksymalnych(int tab[]) {
        int Maks = tab[0];
        int ile = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > Maks) {
                Maks = tab[i];
                ile = 0;
            } else {
                ile++;
            }
        }
        System.out.println("Liczba MAX to: " + Maks + "\n wystepuje " + ile + " razy");
        return ile;
    }

    public static int sumaDodatnich(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                suma += tab[i];
            }
        }
        System.out.println("Suma l. +: " + suma);
        return suma;
    }

    public static int sumaUjemnych(int tab[]) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                suma += tab[i];
            }
        }
        System.out.println("Suma l. -: " + suma);
        return suma;
    }

    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                tab[i] = -1;
            } else if (tab[i] > 0) {
                tab[i] = 1;
            }
        }
    }
    public static int dlMaxCiaguDodatnich(int tab[]){
        int dl = 0;
        int tmp = 0;
        for(int i=0; i< tab.length;i++){
            if(tab[i]>0){
                dl++;
            }
            else if(dl>tmp){
                tmp = dl;
                dl = 0;
            }
            else{
                dl = 0;
            }
        }
        if(tmp>dl){
            return tmp;
        }
        return dl;
    }
    public static void odwrocFragment(int tab[], int lewy,int prawy){
        int tmp[] = new int[prawy-lewy+1];
        int licz = 0;
        for(int i=lewy ;i<=prawy ;i++){
                tmp[licz] = tab[i];
                licz++;
        }
        for(int i=lewy ;i<=prawy ;i++){
                licz--;
                tab[i] = tmp[licz];
        }
    }
}
