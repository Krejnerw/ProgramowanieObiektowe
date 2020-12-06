package wk.priorityqueue;

public class PriorityQueueTest {
    public static void main(String[] args){
        ZadaniePriorytetowe zadaniaPriorytetowe = new ZadaniePriorytetowe();
        zadaniaPriorytetowe.dodaj(5,"wk.priorityqueue.Zadanie o wadze 5");
        zadaniaPriorytetowe.dodaj(9,"wk.priorityqueue.Zadanie o wadze 9");
        zadaniaPriorytetowe.dodaj(1,"wk.priorityqueue.Zadanie o wadze 1");
        zadaniaPriorytetowe.dodaj(3,"wk.priorityqueue.Zadanie o wadze 3");

        System.out.println(zadaniaPriorytetowe.nastepne().getWaga());
    }
}
