package wk.priorityqueue;

import java.util.PriorityQueue;

public class ZadaniePriorytetowe {
    private PriorityQueue<Zadanie> priorityQueue;

    public ZadaniePriorytetowe(){
        this.priorityQueue = new PriorityQueue<>();
    }

    public void dodaj(int priorytet, String opis){

        Zadanie zad = new Zadanie(priorytet, opis);
        priorityQueue.add(zad);
    }
    public Zadanie nastepne(){
        return priorityQueue.remove();
    }

}
