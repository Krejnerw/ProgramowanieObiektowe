import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


public class KolekcjaTest {
    public static void main(String[] args){
        LinkedList<String> listaPracownikow = new LinkedList<>();
        listaPracownikow.add("0Stefan");
        listaPracownikow.add("1Andrzej");
        listaPracownikow.add("2Ania");
        listaPracownikow.add("3Tomek");
        listaPracownikow.add("4Ola");
        listaPracownikow.add("5Kamil");
        listaPracownikow.add("6Olaf");
        listaPracownikow.add("7Paulina");
        listaPracownikow.add("8Paulina");

        Kolekcja.redukuj(listaPracownikow, 2 );
        Kolekcja.print(listaPracownikow);

        System.out.println("======================================");

        Kolekcja.odwroc(listaPracownikow);
        Kolekcja.print(listaPracownikow);

        String tekst = "Ala ma kota. Jej kot lubi myszy. Kot szczesliwy, myszy nie.";

        String zdanieNaOpak =Kolekcja.naOpak(tekst);
        System.out.println(zdanieNaOpak);

        int liczba = 2015;
        Kolekcja.printCyfry(liczba);
        Kolekcja.sitoEratostenesa(60);
    }

}
