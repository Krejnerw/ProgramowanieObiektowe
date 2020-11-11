package pl.imiajd.krejner;

import java.time.LocalDate;

abstract class Osoba
{
    public Osoba(String imiona,String nazwisko, boolean plec, LocalDate dataUr)
    {
        this.imiona = imiona.split("\\s");
        this.plec = plec;
        this.dataUrodzenia = dataUr;
        this.nazwisko = nazwisko;
    }

    public abstract String getOpis();

    public String[] getImiona() {
        return imiona;
    }

    public boolean isPlec() {
        return plec;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    private String[] imiona;
    private boolean plec;
    private LocalDate dataUrodzenia;
    private String nazwisko;
}