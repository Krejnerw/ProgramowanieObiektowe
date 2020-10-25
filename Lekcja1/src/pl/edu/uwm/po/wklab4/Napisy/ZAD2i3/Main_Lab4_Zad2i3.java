package pl.edu.uwm.po.wklab4.Napisy.ZAD2i3;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Lab4_Zad2i3 {

    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);

        String nazwa;
        //E:\\Users\\weron\\Documents\\ProgramowanieObiektowe\\Lekcja1\\src\\pl\\edu\\uwm\\po\\wklab4\\Napisy\\ZAD2i3\\ZAD2i3.java
//        ZAD2:
//        System.out.println("ZAD2:\nPodaj nazwe pliku oraz znak: ");
//        nazwa = scan.nextLine();
//        char c = scan.next().charAt(0);
//        System.out.println(ZAD2i3.countCharInFile(c,nazwa));
//        ZAD3:
        System.out.println("ZAD3:");
        System.out.println(ZAD2i3.countWord("public","E:\\Users\\weron\\Documents\\ProgramowanieObiektowe\\Lekcja1\\src\\pl\\edu\\uwm\\po\\wklab4\\Napisy\\ZAD2i3\\ZAD2i3.java"));
//        nazwa = scan.nextLine();
//        System.out.println(nazwa);
//        String subStr2;
//        subStr2 = scan.next();
//        System.out.println(subStr2);

//        System.out.println(ZAD2i3.countWord(subStr2, nazwa));
    }
}
