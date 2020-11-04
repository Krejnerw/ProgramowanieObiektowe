package pl.imiajd.krejner;

public class Nauczyciel extends Osoba {

    public Nauczyciel(String nazw, int rokUr, double pensja){
        super(nazw, rokUr);
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString(){
        return "Nauczyciel: "+ super.toString()+
                "\npensja: "+this.pensja+"zl";
    }

    private double pensja;

}
