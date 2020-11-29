package Pair;

public class PairDemo {
    public static void main(String[] args){
        Pair<String> imiona = new Pair<>("pierwsze", "Drugie");
        Pair<Integer> liczby = new Pair<>(10,20);

        System.out.println(imiona);
        imiona.swap();
        System.out.println(imiona);

        System.out.println(liczby);
        liczby.swap();
        System.out.println(liczby);
    }
}
