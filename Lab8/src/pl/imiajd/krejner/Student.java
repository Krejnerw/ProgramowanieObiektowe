package pl.imiajd.krejner;

import java.time.LocalDate;

class Student extends Osoba
{
    public Student(String im, String nazwisko, boolean plec, LocalDate dataUr, String kierunek, double sr_ocena)
    {
        super(im, nazwisko, plec, dataUr);
        this.kierunek = kierunek;
        this.srednia_ocena = sr_ocena;
    }

    public String getKierunek() {
        return kierunek;
    }

    public double getSrednia_ocena() {
        return srednia_ocena;
    }

    public void setSrednia_ocena(double srednia_ocena) {
        this.srednia_ocena = srednia_ocena;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek;
    }

    private double srednia_ocena;
    private String kierunek;
}