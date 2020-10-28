package pl.edu.uwm.po.wklab5.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_ {
    public static void main(String[] args){
        int[] list = {1,4,9,16};
        int[] list2 = {9,7,4,9,11};

        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int l :list){
            a.add(l);
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int l:list2){
            b.add(l);
        }
        System.out.println(a);
        System.out.println(b);
        ArrayList<Integer> c = append(a,b);
        ArrayList<Integer> d1 = merge(a,b);
        ArrayList<Integer> d2 = merge(b,a);
        System.out.println(c);
        System.out.println(d1);
        System.out.println(d2);
        ArrayList<Integer> e = mergeSorted(a,b);
        System.out.println(e);
        ArrayList<Integer> f = reversed(a);
        System.out.println(f);
        reverse(b);
        System.out.println(b);
    }
//    ZAD1
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer>  extendedList = (ArrayList) a.clone();
        extendedList.addAll(b);
        return extendedList;
    }
//    ZAD2
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int minL;
        ArrayList<Integer>extended = new ArrayList<Integer>();
        minL = Math.max(a.size(), b.size());
        int i;
        for (i = 0; i < minL; i++) {
            if(i<a.size()){
                extended.add(a.get(i));
            }
            if(i<b.size()){
                extended.add(b.get(i));
            }
        }
        return extended;
    }
//    ZAD3 chyba nie o to chodzi
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> tmp = merge(a,b);
        Collections.sort(tmp);
        return tmp;
    }
//    ZAD4
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> reversedList = new ArrayList<Integer>();
        for(int i=a.size()-1; i>= 0;i--){
            reversedList.add(a.get(i));
        }
        return reversedList;
    }
//    ZAD5
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> tmp = reversed(a);
        for(int i=0; i<a.size()-1;i++){
            a.add(i,a.get(a.size()-1));
            a.remove(a.size()-1);
        }
    }
}
