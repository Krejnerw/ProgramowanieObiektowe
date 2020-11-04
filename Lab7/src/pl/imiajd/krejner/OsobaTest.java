package pl.imiajd.krejner;

public class OsobaTest {
    public static void main(String[] args){
        Osoba nikt = new Osoba("Kowalski", 1990);
        Student stdKowalski = new Student("Kowalski",1990,"Infa");
        Student stdKowalski2 = new Student(nikt.getNazwisko(), nikt.getRokUrodzenia(), "Plastyk");

        Nauczyciel nauczycielKrystyna = new Nauczyciel("Krysiak",1960,2258.4);

        System.out.println(nikt.toString());
        System.out.println(stdKowalski.toString());
        System.out.println(stdKowalski2.toString());
        System.out.println(nauczycielKrystyna.toString());
    }
}
