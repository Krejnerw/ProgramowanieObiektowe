package Pair;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> para) {
        return new Pair(para.getSecond(), para.getFirst());
    }

}

