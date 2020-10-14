package pl.edu.uwm.po.wklab2.ZAD2;
import java.util.Scanner;
public class ZAD2 {
    Scanner scan = new Scanner(System.in);
    int podajN(){
        System.out.println("Podaj l. N");
        int n = scan.nextInt();
        return n;
    }
    double zad2(){
        int n = podajN();
        double suma = 0;

        for(int i=0;i<n;i++){
            double l = scan.nextDouble();
            if(l>0){
                suma += 2*l;
            }
        }
        return suma;
    }
    void zad3(){
        int n = podajN();

        int[] liczby = {0,0,0};
        for(int i=0;i<n;i++){
            double l = scan.nextDouble();
            if(l>0){
                liczby[0]++;
            }
            else if(l<0){
                liczby[1]++;
            }
            else{
                liczby[2]++;
            }
        }
        System.out.printf("Liczby dodatnie: %d \n" +
                "Liczby ujemne: %d \n" +
                "Zera: %d",liczby[0],liczby[1],liczby[2]);
    }
    void zad4(){
        int n = podajN();
        double l[] = new double[2];

        l[0] = scan.nextDouble();
        for(int i=1;i<n;i++){
            double x = scan.nextDouble();
            if(x<l[0]){
                l[0]=x;
            }
            if(x>l[1]) {
                l[1] = x;
            }
        }
        System.out.printf("Najmniejsza liczba to %.2f\n" +
                "a najwieksza to %.2f\n",l[0],l[1]);
    }
    void zad5(){
        int n = podajN();
        double l[] = new double[n];

        l[0] = scan.nextDouble();
        for(int i=1;i<n;i++){
            l[i] = scan.nextDouble();
        }
        for(int i=1;i<n;i++){
            if(l[i-1]>0 && l[i]>0){
                System.out.println("("+l[i-1]+","+l[i]+")");
            }
        }
    }
}
