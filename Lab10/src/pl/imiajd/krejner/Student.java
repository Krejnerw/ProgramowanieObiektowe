package pl.imiajd.krejner;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko, LocalDate dataUrodzenia,double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    protected Osoba clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Osoba other) {
        Student o = (Student) other;
        int compareOsoba=super.compareTo((o));
        if(compareOsoba==0){
            if (this.sredniaOcen < o.getSredniaOcen())return 1;
            if (this.sredniaOcen > o.getSredniaOcen())return -1;
    }
    return compareOsoba;
}

    @Override
    public String toString() {
        return super.toString()+"["+this.sredniaOcen+"]";
    }

    private double sredniaOcen;
}
