package pl.edu.uwm.po.wklab3.ZAD1;

import pl.edu.uwm.po.wklab3.ZAD2.ZAD2;

import java.util.Random;
import java.util.Scanner;

import pl.edu.uwm.po.wklab3.ZAD2.ZAD2;

public class ZAD1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

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
        int tab[] = new int[n];
        for(int i=0; i<n;i++){
            tab[i] = generator.nextInt(1999)-999;
            System.out.printf("%d, ",tab[i]);
        }
        System.out.println();
        int[] parz = {0,0};
        for(int i=0;i<n;i++){
            if(tab[i]%2==0){
                parz[0]++;
            }
            else{
                parz[1]++;
            }
        }
        System.out.println("Liczby parzyste: "+parz[0]+
                "\nliczby nieparzyste: "+parz[1]);
        int Dod[] = {0,0,0};
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                Dod[1]++;
            }
            else if(tab[i] < 0) {
                Dod[2]++;
            }
            else{
                Dod[0]++;
            }
        }
        System.out.println("Liczby dodatnie: " + Dod[1]);
        System.out.println("Liczby ujemne: " +Dod[2]+
                "\nLiczby zerowe: " +Dod[0]);
        int Maks = tab[0];
        int ile = 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > Maks) {
                Maks = tab[i];
                    ile = 1;
            } else {
                ile++;
            }
        }
        System.out.println("Liczba MAX to: " + Maks + "\n wystepuje " + ile + " razy");
        int sumaD = 0;
        int sumaU = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                sumaD += tab[i];
            }
            else{
                sumaU += tab[i];
            }
        }
        System.out.println("Suma l. +: " + sumaD);
        System.out.println("Suma l. -: " + sumaU);

//        for (int i = 0; i < tab.length; i++) {
//            if (tab[i] < 0) {
//                tab[i] = -1;
//            } else if (tab[i] > 0) {
//                tab[i] = 1;
//            }
//        }
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
                System.out.println(tmp);
            }
            else{
                System.out.println(dl);
            }
        for(int i=0; i< tab.length; i++){
            System.out.printf("%d, ",tab[i]);
        }
        int prawy;
        int lewy;
        while(true){
            lewy = scan.nextInt();
            prawy = scan.nextInt();
            if(lewy>=1 && lewy<= prawy && prawy>=lewy && prawy<= n){
                break;
            }
            System.out.println("podaj przedzial od 1- n");
        }
            int tmp2[] = new int[prawy-lewy+1];
            int licz = 0;
            for(int i=lewy ;i<=prawy ;i++){
                tmp2[licz] = tab[i];
                licz++;
            }
            for(int i=lewy ;i<=prawy ;i++){
                licz--;
                tab[i] = tmp2[licz];
            }
            for(int i=0; i< tab.length; i++){
                System.out.printf("%d, ",tab[i]);
            }
        }
}
