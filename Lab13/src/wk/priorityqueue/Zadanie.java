package wk.priorityqueue;

public class Zadanie implements Comparable{
    private int waga;
    private final String opis;

    public Zadanie(int waga, String opis) {
        this.waga = waga;
        this.opis = opis;
    }

    @Override
    public int compareTo(Object o) {
        Zadanie other = (Zadanie)o;
        if(this.waga < other.getWaga()) return -1;
        if(this.waga > other.getWaga()) return 1;
        return 0;
    }

    public int getWaga() {
        return waga;
    }

    public String getOpis() {
        return opis;
    }

}
