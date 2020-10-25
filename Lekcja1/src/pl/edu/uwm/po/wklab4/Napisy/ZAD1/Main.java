package pl.edu.uwm.po.wklab4.Napisy.ZAD1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        System.out.println("ZAD1 a:\npodaj str a potem znak:");
        Scanner scan = new Scanner(System.in);
        String str;
        String subStr;
        int ile;
//        str = scan.nextLine();
//        char c = scan.next().charAt(0);
//        System.out.println("ilosc wystapien \""+c+"\" w " +
//                "stringu \""+str+"\" : "+
//                ZAD1.countChar(str,c));

//        System.out.println("ZAD1 b:\npodaj 2 str:");
//        str = scan.next();
//        subStr = scan.next();
//        ile = ZAD1.countSubStr(str,subStr);
//        System.out.println(ile);

//        System.out.println("ZAD1 c:\npodaj str:");
//        str = scan.next();
//        System.out.println(ZAD1.middle(str));

//        System.out.println("ZAD1 d:\npodaj str oraz liczbe:");
//        str = scan.next();
//        ile = scan.nextInt();
//        System.out.println(ZAD1.repeat(str,ile));

//        System.out.println("ZAD1 e:\npodaj 2 str:");
//        str = scan.next();
//        subStr = scan.next();
//        int[] tab = ZAD1.where(str, subStr);
//        for(int i=0; i< tab.length; i++){
//            System.out.printf("%d, ", tab[i]);
//        }

        System.out.println("ZAD1 f:\npodaj str: ");
        str = scan.next();
        System.out.println(ZAD1.change(str));

        System.out.println("ZAD1 g:\n podaj str: ");
        str = scan.next();
        System.out.println(ZAD1.nice(str));

        System.out.println("ZAD1 h:\n podaj str: ");
        str = scan.next();
        System.out.println(ZAD1.nice(str,":", 3));

    }
}
