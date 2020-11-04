package pl.imiajd.krejner;

public class Osoba extends Object {

    public Osoba(String nazw, int rokUr){
        this.nazwisko = nazw;
        this.rokUrodzenia = rokUr;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString(){
        return this.nazwisko+"\nrok urodzenia: "+this.rokUrodzenia;
    }

    private String nazwisko;
    private int rokUrodzenia;

}
