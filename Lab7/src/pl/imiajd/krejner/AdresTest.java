package pl.imiajd.krejner;

public class AdresTest {
    public static void main(String[] args){
        Adres adres1 = new Adres("Slowińska",10, 12,"Olsztyn","10-693");
        Adres adres2 = new Adres("Slowińska",10,"Rzeszów","35-015");

        adres1.pokaz();
        adres2.pokaz();

        System.out.println("Kod-P: "+adres2.getKod_pocztowy()+" jest przed "+adres1.getKod_pocztowy()+": "+adres2.przed(adres1.getKod_pocztowy()));
        System.out.println("Kod-P: "+adres1.getKod_pocztowy()+" jest przed "+adres2.getKod_pocztowy()+": "+adres1.przed(adres2.getKod_pocztowy()));

    }
}
