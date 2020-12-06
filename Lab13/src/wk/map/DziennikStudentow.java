package wk.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DziennikStudentow {
    Map<Integer, String> dziennik;
    Map<Integer, Student> studenci;

    public DziennikStudentow() {
        dziennik = new TreeMap<>();
        studenci = new TreeMap<>();
    }

    public void dodajStudenta(Student std, String ocena) {
        dziennik.put(std.getId(), ocena);
        studenci.put(std.getId(), std);
    }

    public void usunStudenta(int id) {
        if (dziennik.containsKey(id)) {
            dziennik.remove(id);
            studenci.remove(id);
        } else {
            System.out.println("osoba o indexie" + id + " nie istnieje");
        }
    }

    public void zmienOceneDla(int id, String nowaOcena) {
        if (dziennik.containsKey(id)) {
            dziennik.put(id,nowaOcena);
        } else {
            System.out.println("zamiana niemozliwa osoba o ind" + id + " nie istnieje");
        }
    }

    public void pokazDziennik() {
        List<Student> listaStudentow = new ArrayList<>();
        for (Map.Entry<Integer, Student> osoba : studenci.entrySet()) {
            Student val = osoba.getValue();
            listaStudentow.add(val);
        }
        listaStudentow.sort(null);
        for( Student os: listaStudentow){
            System.out.println(os+ ": "+ dziennik.get(os.getId()));
        }
    }
}
