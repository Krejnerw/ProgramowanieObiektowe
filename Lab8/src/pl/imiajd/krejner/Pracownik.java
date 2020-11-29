package pl.imiajd.krejner;

import java.time.LocalDate;

class Pracownik extends Osoba
{
    public Pracownik(String imiona, String nazwisko, boolean plec, LocalDate dataUr, LocalDate dataZ, double pobory)
    {
        super(imiona, nazwisko, plec, dataUr);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZ;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }

    @Override
    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł", pobory);
    }

    private LocalDate dataZatrudnienia;
    private double pobory;
}