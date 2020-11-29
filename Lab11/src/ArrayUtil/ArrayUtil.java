package ArrayUtil;// nie skonczony mergeSort

public class ArrayUtil {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i].compareTo(tab[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int binSearch(T[] sorted_tab, T obj) {

        int ind = -1;
        int min = 0;
        int max = sorted_tab.length - 1;

        while (min <= max) {
            int polowa = (min + max) / 2;
            if (sorted_tab[polowa].compareTo(obj) < 0) {
//                System.out.println("> niz polowa");
                min = polowa + 1;
            } else if (sorted_tab[polowa].compareTo(obj) > 0) {
//                System.out.println("< niz polowa");
                max = polowa - 1;
            } else if (sorted_tab[polowa].compareTo(obj) == 0) {
//                System.out.println("= polowa");
                ind = polowa;
                break;
            }
        }
        return ind;
    }

    public static <T extends Comparable<T>> void selectionSort(T[] tab) {
        int min = 0;
        int max = tab.length - 1;
        T tmp;
        T min_value;

        while (min <= max) {
            min_value = tab[min];
            int ind = min;
            for (int i = min; i <= max; i++) {
                if (tab[i].compareTo(min_value) < 0) {
                    min_value = tab[i];
                    ind = i;
                }
            }
            tmp = tab[min];
            tab[min] = min_value;
            tab[ind] = tmp;
//            for (T i : tab){
//                System.out.print(i);
//            }
//            System.out.println();
            min++;
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] tab){
        sortArray(tab, 0, tab.length - 1);
    }

    private static <T extends Comparable<T>> void sortArray(T[] tab,int min, int max){

        if((max-min) >= 1){
            int middle1 = (min+max)/2;
            int middle2 = middle1 +1;

            sortArray(tab, min, middle1);
            sortArray(tab, middle2, max);

            merge(tab, min, middle1, middle2, max);
        }
    }
    private static <T extends Comparable<? super T>> void merge(T[] tab, int min, int middle1,
                                                                int middle2, int max){
        int leftInd = min; // ind dla tab lewej
        int rightInd = middle2; // ind dla tab prawej
        int tmpInd = min; // ind dla tab tmp

        @SuppressWarnings("unchecked")
        T[] tmp = (T[]) new Comparable[tab.length];

        while( leftInd<=middle1 && rightInd<=max){
            if(tab[leftInd].compareTo(tab[rightInd]) <= 0){
                tmp[tmpInd++] = tab[leftInd++];
            }
            else{
                tmp[tmpInd++] = tab[rightInd++];
            }
        }
        if(leftInd == middle2){
            while(rightInd <= max){
                tmp[tmpInd++] = tab[rightInd++];
            }
        }
        else {
            while(leftInd <= middle1){
                tmp[tmpInd++] = tab[leftInd++];
            }
        }
        for(int i = min; i<= max; i++){
            tab[i] = tmp[i];
        }
    }


}
