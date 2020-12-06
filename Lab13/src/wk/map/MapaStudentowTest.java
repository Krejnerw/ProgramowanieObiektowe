package wk.map;

public class MapaStudentowTest {
    public static void main(String[] args){

//        Dziennik dziennik = new Dziennik();
//        dziennik.dodajStudenta("Kowalski", "Dst+");
//        dziennik.dodajStudenta("Kowalewski", "Ndst");
//        dziennik.dodajStudenta("Adamczak", "Bdb");
//        dziennik.dodajStudenta("Witek", "Db+");
//        dziennik.dodajStudenta("Witekowski", "Db");
//
//        dziennik.pokazDziennik();
//
//        dziennik.zmienOceneDla("Kowalewski", "Dst");
//        dziennik.zmienOceneDla("Krysiak", "Ndst");
//
//        dziennik.pokazDziennik();
//        dziennik.usunStudenta("Kowalski");
//        dziennik.usunStudenta("Krysiak");
//
//        dziennik.pokazDziennik();
        DziennikStudentow dziennikStd  = new DziennikStudentow();

        dziennikStd.dodajStudenta(new Student("Basia", "Kowalska"), "Bdb");
        dziennikStd.dodajStudenta(new Student("Asia", "Kowalska"), "Bdb");
        dziennikStd.dodajStudenta(new Student("Asia", "Anlikow"), "Db");
        dziennikStd.dodajStudenta(new Student("Tomasz", "Alekow"), "Dst");
        dziennikStd.dodajStudenta(new Student("Asia", "Kowalska"), "Db");

        dziennikStd.pokazDziennik();
    }
}
