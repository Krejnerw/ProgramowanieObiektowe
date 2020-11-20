//nie spelnia chyba c
package pl.imiajd.krejner;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public int compareTo(Osoba other) {
        if(this.nazwisko.compareTo(other.getNazwisko()) == 0){
            if(this.dataUrodzenia.compareTo(other.getDataUrodzenia()) == 0)return 0;
            if(this.dataUrodzenia.compareTo(other.getDataUrodzenia()) < 0)return -1;
            return 1;
        }
        if(this.nazwisko.compareTo(other.getNazwisko()) < 0 ){
            return -1;
        }
        return 1;
//        if(this.nazwisko.compareTo(other.getNazwisko()) == 0)return 0;
//        if(this.nazwisko.compareTo(other.getNazwisko()) < 0) return -1;
//        return 1;
    }

    @Override
    protected Osoba clone() throws CloneNotSupportedException {
        Osoba cloned = (Osoba) super.clone();
        return cloned;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)return true;
        if(obj == null)return false;
        if( !(obj instanceof Osoba))return false;
        Osoba other = (Osoba)obj;
//        return other.getNazwisko().equals(this.getNazwisko())
//                && other.getDataUrodzenia().equals(this.getDataUrodzenia());
        if(this.compareTo(other) == 1)return true;
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" ["+this.getNazwisko()+", "+this.getDataUrodzenia()+"]";
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;
}
