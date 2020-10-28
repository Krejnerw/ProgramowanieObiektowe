package pl.edu.uwm.wk.po.lab6;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSet extends Object {
    private boolean[] tab;
    public IntegerSet(){
        tab = new boolean[100];
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet union = new IntegerSet();
        for(int i=0; i<100;i++){
            if(a.tab[i] || b.tab[i]){
                union.tab[i] = true;
            }
        }
        return union;
    }
    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet inter = new IntegerSet();
        for(int i=0; i<100; i++){
            if(a.tab[i]==true && b.tab[i]==true){
                inter.tab[i] = true;
            }
        }
        return inter;
    }
    public void insertElement(int value){
        this.tab[value-1] = true;
    }
    public void deleteElement(int value){
        this.tab[value-1] = false;
    }
    @Override
    public String toString(){
        StringBuilder txt = new StringBuilder();
        for(int i=0; i<100; i++){
            if(this.tab[i]){
                txt.append(i+1);
                txt.append(' ');
            }
        }
        return txt.toString();
    }
    public boolean equals(IntegerSet a){
        return this.toString().equals(a.toString());
    }
}
