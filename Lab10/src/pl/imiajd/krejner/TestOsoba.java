package pl.imiajd.krejner;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestOsoba {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Osoba> lista = new ArrayList<>();
        lista.add(new Osoba("Kris", LocalDate.of(2000,1,3)));
        lista.add(new Osoba("Krejner",LocalDate.of(2000,1,3)));
        lista.add(lista.get(0).clone());
        lista.add(new Osoba("Kris",LocalDate.of(1995,12,15)));
        lista.add(new Osoba("Dory", LocalDate.of(2001,1,3)));

        System.out.println("Przed sortowaniem:");
        for(Osoba i : lista){
            System.out.println(i);
        }
        System.out.println("=====================================\nPo sortowaniu:");
        Collections.sort(lista);
//        lista.sort(null);
        for(Osoba i : lista) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");


        ArrayList<Student> studenci = new ArrayList<>();

        studenci.add(new Student(lista.get(4).getNazwisko(),lista.get(4).getDataUrodzenia(),3.00));
        studenci.add(new Student(lista.get(2).getNazwisko(),lista.get(2).getDataUrodzenia(),3.74));
        studenci.add(new Student(lista.get(0).getNazwisko(),lista.get(0).getDataUrodzenia(),4.34));
        studenci.add(new Student(lista.get(3).getNazwisko(),lista.get(3).getDataUrodzenia(),4.87));
        studenci.add(new Student(lista.get(1).getNazwisko(),lista.get(1).getDataUrodzenia(),4.30));

        System.out.println("Przed sortowaniem:");
        for(Student i : studenci){
            System.out.println(i);
        }
        System.out.println("=====================================\nPo sortowaniu:");
//        Collections.sort(studenci);
        studenci.sort(null);
        for(Student i : studenci) {
            System.out.println(i);
        }
        System.out.println("++++++++++++++++++++++++++++++++++");

//        Napisz program, który czyta kolejne linie z pliku podanego jako argument wywołania programu
//        i umieszcza je w kolekcji typu ArrayList<String>. Następnie sortuje tę kolekcją po czym
//        wypisuje ją na ekran.
        if (args.length != 0) {
            try {
                File file = new File(args[0]);
                Scanner scan = new Scanner(file);

                ArrayList fromFileList = new ArrayList();
                while(scan.hasNextLine()){
                    fromFileList.add(scan.nextLine());
                }
                fromFileList.sort(null);
                for(Object i :fromFileList){
                    System.out.println(i);
                }
                scan.close();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }

        }
    }
}
