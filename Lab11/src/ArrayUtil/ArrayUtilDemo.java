package ArrayUtil;

import java.time.LocalDate;

public class ArrayUtilDemo {
    public static void main(String[] args){
        LocalDate[] dates_arr = new LocalDate[5];
        Integer[] integers_arr= new Integer[]{4, 7, 2, 9, 3};

        LocalDate[] dates_arr2;
        Integer[] integers_arr2 = integers_arr.clone();

        dates_arr[0] = (LocalDate.of(2000,12,4));
        dates_arr[1] = (LocalDate.of(2012,4,26));
        dates_arr[2] = (LocalDate.of(1999,1,12));
        dates_arr[3] = (LocalDate.of(1999,1,11));
        dates_arr[4] = (LocalDate.of(1999,2,11));

        dates_arr2 = dates_arr.clone();
//-----------------------------------------------------------------------
        System.out.println("integers_arr:");
        for(Integer i : integers_arr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("\tindex 9 to: "+ArrayUtil.binSearch(integers_arr,9));
        System.out.println("\tindex 10 to: "+ArrayUtil.binSearch(integers_arr,10));

        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(integers_arr));

        ArrayUtil.selectionSort(integers_arr);

        System.out.println("integers_arr:");
        for(Integer i : integers_arr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("\tindex 9 to: "+ArrayUtil.binSearch(integers_arr,9));
        System.out.println("\tindex 10 to: "+ArrayUtil.binSearch(integers_arr,10));

        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(integers_arr));

        System.out.println("-------------------------------------------------");

        System.out.println("dates_arr:");
        for(LocalDate d : dates_arr){
            System.out.print(d+" ");
        }
        System.out.println();

        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(dates_arr));

        ArrayUtil.selectionSort(dates_arr);

        System.out.println("dates_arr:");
        for(LocalDate d : dates_arr){
            System.out.print(d+" ");
        }
        System.out.println();

        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(dates_arr));

        System.out.println("============================================");

        System.out.println("integers_arr2:");
        for(Integer i : integers_arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(integers_arr2));

        ArrayUtil.mergeSort(integers_arr2);

        System.out.println("integers_arr2:");
        for(Integer i : integers_arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("\tisSorted?: "+ArrayUtil.isSorted(integers_arr2));

        System.out.println("---------------------------------------------");

        System.out.println("dates_arr2:");
        for(LocalDate d : dates_arr2) {
            System.out.print(d + " ");
        }
        System.out.println("\n\tisSorted?: "+ArrayUtil.isSorted(dates_arr2));

        ArrayUtil.mergeSort(dates_arr2);

        for(LocalDate d : dates_arr2){
            System.out.print(d+" ");
        }

        System.out.println("\n\tisSorted?: "+ArrayUtil.isSorted(dates_arr2));




    }
}
