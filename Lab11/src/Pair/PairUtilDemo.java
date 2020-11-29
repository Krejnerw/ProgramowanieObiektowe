package Pair;

public class PairUtilDemo {
    public static void main(String[] args){
        Pair<String> imiona = new Pair<>("pierwsze", "Drugie");
        Pair<Integer> liczby = new Pair<>(10,20);

        Pair imiona_reverse = PairUtil.swap(imiona);
        Pair liczby_reverse = PairUtil.swap(liczby);

        System.out.println(imiona);
        System.out.println(imiona_reverse);

        System.out.println(liczby);
        System.out.println(liczby_reverse);
    }
}
