package pl.edu.uwm.wk.po.lab6;

public class TestIntegerSet {
    public static void main(String[] args){
        IntegerSet zbior = new IntegerSet();
        IntegerSet zbior2 = new IntegerSet();
        int[] tab = {1,12,2,30,21,15,71,91};

        for(int l:tab){
            zbior.insertElement(l);
            zbior2.insertElement(l);
        }
        System.out.println("Zbior A:\n"+zbior.toString());
        System.out.println("Zbior B:\n"+zbior2.toString());

        System.out.println("Czy zb A == B?\n"+zbior.equals(zbior2));
        System.out.println("Zbior A:\n"+zbior.toString());
        zbior2.deleteElement(71);
        System.out.println("Zbior B:\n"+zbior2.toString());
        System.out.println("Czy zb A == B?\n"+zbior.equals(zbior2));

        zbior2.insertElement(87);
        zbior2.insertElement(80);
        zbior2.insertElement(50);
        zbior2.insertElement(52);
        zbior2.insertElement(48);
        zbior2.deleteElement(30);
        zbior2.deleteElement(12);

        System.out.println("Zbior A:\n"+zbior.toString());
        System.out.println("Zbior B:\n"+zbior2.toString());

        IntegerSet union = IntegerSet.union(zbior, zbior2);
        IntegerSet inter = IntegerSet.intersection(zbior, zbior2);
        System.out.println("Suma mnogosciowa zb A i B:\n"+union.toString());
        System.out.println("Iloczyn mnogosciowy zb A i B:\n"+inter.toString());
    }
}
