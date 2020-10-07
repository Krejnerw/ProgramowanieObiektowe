package pl.edu.uwm.po.wklab1;

public class ZAD3 {
    public static void ZAD_3_1(){
        System.out.println("Zad 3.1 : "+31+29+31);
    }
    public static void ZAD_3_2(){
        int licznik = 0;
        int suma = 0;
        while(licznik<=10){
            suma += licznik;
            licznik++;
        }
        System.out.println("Zad 3.2 : "+suma);
    }
    public static void ZAD_3_3(){
        int licznik = 1;
        int il = 1;
        while(licznik<=10){
            il *= licznik;
            licznik++;
        }
        System.out.println("Zad 3.3 : "+il);
    }
    public static void ZAD_3_4(){
        float konto = 1000;
        System.out.println("Zad 3.4 : ");
        for (int i=1;i<=3;i++){
            konto *=1.06;
            System.out.println("rok "+i+":"+konto);
        }
    }
    public  static void ZAD_3_5(){
        System.out.println("Zad 3.5 : ");
        String slowo = "java";
        int dl = slowo.length();
        for (int i = 0; i<3 ; i++){
            if(i%2==0){
                System.out.println("+"+"-".repeat(dl+2)+"+");
            }
            else{
                System.out.println("| "+slowo+" |");
            }
        }
    }
    public static void main(String[] args){
        ZAD_3_1();
        ZAD_3_2();
        ZAD_3_3();
        ZAD_3_4();
        ZAD_3_5();
    }
}
