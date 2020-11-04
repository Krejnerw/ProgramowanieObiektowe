package pl.imiajd.krejner;

public class Student extends Osoba {

    public Student(String nazw, int rokUr, String kier){
        super(nazw,rokUr);
        this.kierunek = kier;
    }

    public String getKierunek() {
        return kierunek;
    }

    @Override
    public String toString(){
        return "Student: "+super.toString()+
                "\nkierunek:"+this.kierunek;
    }

    private String kierunek;

}
