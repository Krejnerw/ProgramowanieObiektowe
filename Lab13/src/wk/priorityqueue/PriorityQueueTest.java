
public class PriorityQueueTest {
    public static void main(String[] args){
        ZadaniaPriorytetowe zadaniaPriorytetowe = new ZadaniaPriorytetowe();
        zadaniaPriorytetowe.dodaj(5,"Zadanie o wadze 5");
        zadaniaPriorytetowe.dodaj(9,"Zadanie o wadze 9");
        zadaniaPriorytetowe.dodaj(1,"Zadanie o wadze 1");
        zadaniaPriorytetowe.dodaj(3,"Zadanie o wadze 3");

        System.out.println(zadaniaPriorytetowe.nastepne().getWaga());
    }
}
