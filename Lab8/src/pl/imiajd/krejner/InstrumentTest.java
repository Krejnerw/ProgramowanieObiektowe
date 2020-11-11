package pl.imiajd.krejner;

import java.time.LocalDate;
import java.util.ArrayList;

public class InstrumentTest {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Alem żeśmy zagrali", LocalDate.of(1970, 12, 05)));
        orkiestra.add(new Flet("Gramy dla myszy", LocalDate.of(1980, 01, 15)));
        orkiestra.add(new Fortepian("Gra jak ta lala", LocalDate.of(2018, 05, 17)));
        orkiestra.add(new Skrzypce("Lepiej nie bedzie", LocalDate.of(2019, 11, 29)));
        orkiestra.add(new Skrzypce("Lepiej nie mówić", LocalDate.of(1720, 01, 01)));
        for (Instrument i : orkiestra) {
            System.out.println(i.dzwiek());
//            System.out.println(i.toString());
        }
        System.out.println(orkiestra);

        System.out.println(orkiestra.get(0).equals(orkiestra.get(1).dzwiek()));
        System.out.println(orkiestra.get(0).equals(orkiestra.get(2).dzwiek()));

        System.out.println(orkiestra.get(2).equals(orkiestra.get(3).dzwiek()));
        System.out.println(orkiestra.get(3).equals(orkiestra.get(4).dzwiek()));
    }
}
