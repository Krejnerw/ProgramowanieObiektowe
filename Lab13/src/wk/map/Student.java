package wk.map;

public class Student implements Comparable<Student> {
    private static int ind = 0;
    private String imie;
    private String nazwisko;
    private int id;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = ind;
        ind++;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {

        if (nazwisko.compareTo(o.nazwisko) > 0) return 1;
        if (nazwisko.compareTo(o.nazwisko) < 0) return -1;
        if (nazwisko.compareTo(o.nazwisko) == 0) {
            if (imie.compareTo(o.imie) > 0) return 1;
            if (imie.compareTo(o.imie) < 0) return -1;
            if (imie.compareTo(o.imie) == 0) {
                if (this.id < o.id) return -1;
                if (this.id > o.id) return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return nazwisko +" "+imie;
    }
}
