package pl.edu.uwm.po.wklab2.ZAD2;

import java.util.Scanner;

class ZAD1
{
    Scanner scan = new Scanner(System.in);
    int podajLiczbe(){
//        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj l. N");
        int n = scan.nextInt();
        return n;
    }
    int zad1a(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=0;i<n;i++){
            liczba = scan.nextInt();
            if(liczba%2!=0){
                ile++;
            }
        }
        return ile;
    }
    int zad1b(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=0;i<n;i++){
            liczba = scan.nextInt();
            if(liczba%3==0 && liczba%5!=0){
                ile++;
            }
        }
        return ile;
    }
    int zad1c(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=0;i<n;i++){
            liczba = scan.nextInt();
            if(Math.sqrt(liczba)%2==0){
                ile++;
            }
        }
        return ile;
    }
    int zad1d(){
        int n = podajLiczbe();
        int ile = 0;
        int[] liczba = new int[n];
        for(int i=0;i<n;i++){
            liczba[i] = scan.nextInt();
//                System.out.printf("%d< (%d+%d)/2", liczba[i - 1], liczba[i - 2], liczba[i]);
                if(i >1 && liczba[i-1]<(liczba[i-2]+liczba[i])/2){
                ile++;
            }
        }
        return ile;
    }
    int silnia(int n){
        int il=1;
        for(int i=1;i<=n;i++){
            il*=i;
        }
        return il;
    }
    int zad1e(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=1;i<=n;i++){
            liczba = scan.nextInt();
            if(Math.pow(2,i)<liczba && liczba<silnia(i)) {
                ile++;
            }
        }
        return ile;
    }
    int zad1f(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=1;i<=n;i++){
            liczba = scan.nextInt();
            if(i%2==1 && liczba%2==0) {
                ile++;
            }
        }
        return ile;
    }
    int zad1g(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=1;i<=n;i++){
            liczba = scan.nextInt();
            if(liczba>=0 && liczba%2==1) {
                ile++;
            }
        }
        return ile;
    }
    int zad1h(){
        int n = podajLiczbe();
        int ile = 0;
        int liczba;
        for(int i=1;i<=n;i++){
            liczba = scan.nextInt();
            if(Math.abs(liczba) < Math.pow(i,2)) {
                ile++;
            }
        }
        return ile;
    }
}


