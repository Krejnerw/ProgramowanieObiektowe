package pl.imiajd.krejner;

import java.time.LocalDate;
import java.util.*;
//zmodyfikowanie funkcjii main w klasie TestOsoba, tak, aby sprawdzić czy nowe metody poprawnie działają.
public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Jan Borys","Kowalski",true,LocalDate.of(2000,03,10), LocalDate.of(2019,01,20),50000);
        ludzie[1] = new Student("Małgorzata"," Nowak",false, LocalDate.of(2000,10,28), "informatyka",4.35);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");



        for (Osoba p : ludzie) {
            for( String i: p.getImiona()){
                System.out.print(i+" ");
            }
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
            if (p instanceof Pracownik){
                System.out.println("Data zatrudnienie: "+((Pracownik) p).getDataZatrudnienia());
            }
            if(p instanceof Student){
                System.out.println("Srednia ocen: "+ ((Student) p).getSrednia_ocena());
            }
            if(p.isPlec()){
                System.out.println("plec: mezczyzna");
            }
            else{
                System.out.println("plec: kobieta");
            }
            System.out.println("Urodzony/a: "+p.getDataUrodzenia());

//            System.out.println(p.getClass());
        }
    }
}


