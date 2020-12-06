package wk.map;

import java.util.Map;
import java.util.TreeMap;

public class Dziennik {
    private Map<String, String> dziennik;

    public Dziennik() {
        dziennik = new TreeMap<>();
    }

    public void dodajStudenta(String nazwisko, String ocena) {
        dziennik.put(nazwisko, ocena);
    }

    public void usunStudenta(String nazwisko) {
        if ( dziennik.containsKey(nazwisko))
            dziennik.remove(nazwisko);
        else {
            System.out.println("osoba "+nazwisko+" nie istnieje");
        }
    }

    public void zmienOceneDla(String nazwisko, String nowaOcena) {
        if (dziennik.containsKey(nazwisko)) {
            dziennik.put(nazwisko, nowaOcena);
        } else {
            System.out.println("zamiana niemozliwa osoba "+nazwisko+" nie istnieje");
        }
    }

    public void pokazDziennik() {
        for( Map.Entry<String,String> osoba : dziennik.entrySet()){
            String key = osoba.getKey();
            String val = osoba.getValue();
            System.out.println(key+": "+val);
        }
    }

}
